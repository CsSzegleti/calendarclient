package com.cry0.calendarclient.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cry0.calendarclient.business.client.CalendarClient;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CalendarController {

    private final CalendarClient client;

    @GetMapping("/getCalendarInfo/{userName}")
    public String getCalendarInfo(@PathVariable String userName) throws IOException, InterruptedException {
        return client.getCalendarInfo(userName);
    }
    
}
