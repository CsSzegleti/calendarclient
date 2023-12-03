package com.cry0.calendarclient.business.client.model;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

import com.cry0.calendarclient.business.client.utils.CustomDateDeserializer;
import com.cry0.calendarclient.business.client.utils.CustomStringDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Prop {

    @JacksonXmlProperty(localName = "getetag")
    @JsonDeserialize(using = CustomStringDeserializer.class)
    private String getEtag;

    @JacksonXmlProperty(localName = "getctag")
    @JsonDeserialize(using = CustomStringDeserializer.class)
    private String getCtag;

    @JacksonXmlProperty(localName = "displayname")
    private String displayName;

    @JacksonXmlProperty(localName = "calendar-color")
    private String calendarColor;

    // @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "EEE, dd MMM yyyy HH:mm:ss z")
    @JacksonXmlProperty(localName = "getlastmodified")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    private ZonedDateTime lastModified;

    public String getGetEtag() {
        return getEtag;
    }

    public void setGetEtag(String getEtag) {
        this.getEtag = getEtag;
    }

    public String getGetCtag() {
        return getCtag;
    }

    public void setGetCtag(String getCtag) {
        this.getCtag = getCtag;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getCalendarColor() {
        return calendarColor;
    }

    public void setCalendarColor(String calendarColor) {
        this.calendarColor = calendarColor;
    }

    public ZonedDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(ZonedDateTime lastModified) {
        this.lastModified = lastModified;
    }

}
