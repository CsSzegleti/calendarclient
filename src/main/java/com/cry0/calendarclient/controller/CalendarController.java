package com.cry0.calendarclient.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cry0.calendarclient.business.client.CalendarClient;

import jakarta.xml.bind.JAXBException;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CalendarController {

    private final CalendarClient client;

    @GetMapping("/getCalendar")
    public String getCalendar(@RequestParam String calendarId) throws IOException, InterruptedException, JAXBException {
        return client.getCalendarInfo(calendarId);
    }
    
}
