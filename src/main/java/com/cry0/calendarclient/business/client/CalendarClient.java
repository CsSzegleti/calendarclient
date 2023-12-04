package com.cry0.calendarclient.business.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cry0.calendarclient.business.client.model.CalendarQuery;
import com.cry0.calendarclient.business.client.model.Multistatus;
import com.cry0.calendarclient.business.client.model.request.Propfind;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Component
public class CalendarClient {

    @Value("${caldav.base.url}")
    private String calendarBaseUrl;

    public Multistatus getCalendarInfo(String user, String calendar) throws IOException, InterruptedException {

        Propfind propfind = new Propfind();

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.registerModule(new JavaTimeModule());

        String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(propfind);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.format("%s%s/%s/", calendarBaseUrl, user, calendar)))
                .method(CalendarMethod.PROPFIND.name(),
                        HttpRequest.BodyPublishers.ofString(xml))
                .build();

        System.out.println(xml);

        HttpResponse<String> res = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        Multistatus result = xmlMapper.readValue(res.body(), Multistatus.class);

        return result;
    }

    public String getCalendarData(String user, String calendar) throws IOException, InterruptedException {
        CalendarQuery calendarQuery = new CalendarQuery();
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.registerModule(new JavaTimeModule());
        String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(calendarQuery);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.format("%s%s/%s/", calendarBaseUrl, user, calendar)))
                .method(CalendarMethod.REPORT.name(),
                        HttpRequest.BodyPublishers.ofString(xml))
                .build();

        HttpResponse<String> res = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        return res.body();

        // Multistatus result = xmlMapper.readValue(res.body(), Multistatus.class);

        // return result;

    }
}
