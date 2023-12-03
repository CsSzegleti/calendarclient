package com.cry0.calendarclient.business.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cry0.calendarclient.business.client.model.Multistatus;
import com.cry0.calendarclient.business.client.model.Property;
import com.cry0.calendarclient.business.client.model.PropertyFactory;
import com.cry0.calendarclient.business.client.model.Propfind;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Component
public class CalendarClient {

    @Value("${caldav.base.url}")
    private String calendarBaseUrl;

    public Multistatus getCalendarInfo(String user, String calendar) throws IOException, InterruptedException {

        Propfind propfind = new Propfind();

        propfind.addProperty(PropertyFactory.createProperty(Property.DISPLAY_NAME));
        propfind.addProperty(PropertyFactory.createProperty(Property.GET_ETAG));
        propfind.addProperty(PropertyFactory.createProperty(Property.GET_CTAG));
        propfind.addProperty(PropertyFactory.createProperty(Property.CALENDAR_COLOR));
        propfind.addProperty(PropertyFactory.createProperty(Property.GET_LAST_MODIFIED));

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.registerModule(new JavaTimeModule());

        String xml = xmlMapper.writeValueAsString(propfind);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(String.format("%s%s/%s/", calendarBaseUrl, user, calendar)))
        .method(CalendarMethod.PROPFIND.name(),
        HttpRequest.BodyPublishers.ofString(xml)).build();

        HttpResponse<String> res = client.send(request,
        HttpResponse.BodyHandlers.ofString());

        Multistatus result = xmlMapper.readValue(res.body(), Multistatus.class);

        return result;
    }
}
