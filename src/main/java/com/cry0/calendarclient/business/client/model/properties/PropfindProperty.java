package com.cry0.calendarclient.business.client.model.properties;

import java.time.ZonedDateTime;

import com.cry0.calendarclient.business.client.model.constant.Namespace;
import com.cry0.calendarclient.business.client.model.constant.PropertyName;
import com.cry0.calendarclient.business.client.utils.CustomDateDeserializer;
import com.cry0.calendarclient.business.client.utils.CustomStringDeserializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PropfindProperty {

    @JacksonXmlProperty(localName = PropertyName.GET_CTAG, namespace = Namespace.CS)
    @JsonDeserialize(using = CustomStringDeserializer.class)
    private String ctag;

    @JacksonXmlProperty(localName = PropertyName.DISPLAY_NAME, namespace = Namespace.DAV)
    private String displayName;

    @JacksonXmlProperty(localName = PropertyName.CALENDAR_COLOR, namespace = Namespace.ICAL)
    private String calendarColor;

    @JacksonXmlProperty(localName = PropertyName.GET_LAST_MODIFIED, namespace = Namespace.DAV)
    @JsonDeserialize(using = CustomDateDeserializer.class)
    private ZonedDateTime lastModified;

    public String getCtag() {
        return ctag;
    }

    public void setCtag(String ctag) {
        this.ctag = ctag;
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
