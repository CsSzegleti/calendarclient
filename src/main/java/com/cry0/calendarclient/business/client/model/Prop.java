package com.cry0.calendarclient.business.client.model;

import java.time.ZonedDateTime;
import java.util.List;

import com.cry0.calendarclient.business.client.utils.CustomDateDeserializer;
import com.cry0.calendarclient.business.client.utils.CustomStringDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Prop {

    @JacksonXmlProperty(localName = Property.GET_ETAG)
    @JsonDeserialize(using = CustomStringDeserializer.class)
    private String getEtag;

    @JacksonXmlProperty(localName = Property.GET_CTAG)
    @JsonDeserialize(using = CustomStringDeserializer.class)
    private String getCtag;

    @JacksonXmlProperty(localName = Property.DISPLAY_NAME)
    private String displayName;

    @JacksonXmlProperty(localName = Property.CALENDAR_COLOR)
    private String calendarColor;

    @JacksonXmlProperty(localName = Property.GET_LAST_MODIFIED)
    @JsonDeserialize(using = CustomDateDeserializer.class)
    private ZonedDateTime lastModified;

    @JacksonXmlElementWrapper(localName = Property.SUPPORTED_CALENDAR_COMPONENT_SET)
    private List<Comp> supportedComponents;

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

    public List<Comp> getSupportedComponents() {
        return supportedComponents;
    }

    public void setSupportedComponents(List<Comp> supportedComponents) {
        this.supportedComponents = supportedComponents;
    }

    
}
