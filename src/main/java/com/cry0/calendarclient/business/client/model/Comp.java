package com.cry0.calendarclient.business.client.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Comp {

    @JacksonXmlProperty(isAttribute = true)
    private CalendarComponentType name;

    public CalendarComponentType getName() {
        return name;
    }

    public void setName(CalendarComponentType name) {
        this.name = name;
    }

    public Comp() {
    }

    public Comp(CalendarComponentType name) {
        this.name = name;
    }
}
