package com.cry0.calendarclient.business.client.model;

import java.util.Map;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "propstat")
public class Propstat {
    // @JacksonXmlProperty(localName = "status")
    // private String status;

    // @JacksonXmlProperty(localName = "getetag")
    // private String getEtag;
    
    // @JacksonXmlProperty(localName = "displayName")
    // private String displayName;

    // @JacksonXmlProperty(localName = "calendar-color")
    // private String calendarColor;

    @JacksonXmlElementWrapper(localName = "prop")
    Map<String, String> properties;

    @JacksonXmlProperty(localName = "status")
    private String status;

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Propstat() {
    }

    public Propstat(Map<String, String> properties, String status) {
        this.properties = properties;
        this.status = status;
    }

    
}
