package com.cry0.calendarclient.business.client.model.filter;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class CompFilter implements Filter {

    @JacksonXmlProperty(isAttribute = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompFilter(String name) {
        this.name = name;
    }
}
