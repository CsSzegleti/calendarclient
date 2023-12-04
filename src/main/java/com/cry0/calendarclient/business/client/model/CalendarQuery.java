package com.cry0.calendarclient.business.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.cry0.calendarclient.business.client.model.filter.CompFilter;
import com.cry0.calendarclient.business.client.model.filter.Filter;
import com.cry0.calendarclient.business.client.model.properties.Property;

@JacksonXmlRootElement(localName = "calendar-query", namespace = "urn:ietf:params:xml:ns:caldav")
public class CalendarQuery {

    @JacksonXmlProperty(localName = "prop", namespace = "DAV:")
    private Property property;

    // @JsonProperty("comp-filter")
    @JacksonXmlProperty(localName = "comp-filter", namespace = "urn:ietf:params:xml:ns:caldav")
    @JacksonXmlElementWrapper(useWrapping = true, localName = "filter", namespace = "urn:ietf:params:xml:ns:caldav")
    private List<Filter> filters;

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public CalendarQuery() {
        this.filters = new ArrayList<>();
        this.filters.add(new CompFilter(CalendarComponentType.VCALENDAR.name()));
        this.property = new Property();
    }
}
