package com.cry0.calendarclient.business.client;

import java.io.IOException;
import java.io.StringWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.stereotype.Component;

import com.cry0.calendarclient.business.client.model.Property;
import com.cry0.calendarclient.business.client.model.Propfind;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Component
public class CalendarClient {

    private String calendarBaseUrl = "http://localhost:5232/csongor/";

    public String getCalendarInfo(String calendar) throws IOException, InterruptedException {

        Propfind propfind = new Propfind();

        propfind.addProperty(new Property<String>("displayName", null, null));
        propfind.addProperty(new Property<String>("getctag", null, null));

        XmlMapper xmlMapper = new XmlMapper();

        String xml = xmlMapper.writeValueAsString(propfind);


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(String.format("%s%s/",calendarBaseUrl, calendar)))
        .method(CalendarMethod.PROPFIND.name(),
        HttpRequest.BodyPublishers.ofString(xml)).build();

        HttpResponse<String> res = client.send(request,
        HttpResponse.BodyHandlers.ofString());

        return res.body();
    }
}
