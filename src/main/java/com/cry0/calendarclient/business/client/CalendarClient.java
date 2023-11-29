package com.cry0.calendarclient.business.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.stereotype.Component;

@Component
public class CalendarClient {

    private String calendarBaseUrl = "http://localhost:5232/csongor/";

    public String getCalendarInfo(String calendar) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.format("%s%s/",calendarBaseUrl, calendar)))
                .method(CalendarMethod.PROPFIND.name(), HttpRequest.BodyPublishers.noBody()).build();

        HttpResponse<String> res = client.send(request, HttpResponse.BodyHandlers.ofString());

        return res.body();
    }
}
