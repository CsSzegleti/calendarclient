package com.cry0.calendarclient.business.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cry0.calendarclient.business.client.model.Property;
import com.cry0.calendarclient.business.client.model.PropertyFactory;
import com.cry0.calendarclient.business.client.model.Propfind;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Component
public class CalendarClient {

    @Value("${caldav.base.url}")
    private String calendarBaseUrl;

    public String getCalendarInfo(String user, String calendar) throws IOException, InterruptedException {

        Propfind propfind = new Propfind();

        propfind.addProperty(PropertyFactory.createProperty(Property.DISPLAY_NAME));
        propfind.addProperty(PropertyFactory.createProperty(Property.GET_ETAG));
        propfind.addProperty(PropertyFactory.createProperty(Property.GET_CTAG));

        XmlMapper xmlMapper = new XmlMapper();

        String xml = xmlMapper.writeValueAsString(propfind);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(String.format("%s%s/%s/", calendarBaseUrl, user, calendar)))
        .method(CalendarMethod.PROPFIND.name(),
        HttpRequest.BodyPublishers.ofString(xml)).build();

        HttpResponse<String> res = client.send(request,
        HttpResponse.BodyHandlers.ofString());

        return res.body();
    }
}
