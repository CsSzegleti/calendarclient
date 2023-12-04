package com.cry0.calendarclient.business.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.cry0.calendarclient.business.client.model.constant.CalendarComponentType;
import com.cry0.calendarclient.business.client.model.constant.PropertyName;
import com.cry0.calendarclient.business.client.model.filter.CompFilter;
import com.cry0.calendarclient.business.client.model.filter.Filter;
import com.cry0.calendarclient.business.client.model.properties.CalendarQueryProperty;

@JacksonXmlRootElement(localName = PropertyName.CALENDAR_QUERY, namespace = "urn:ietf:params:xml:ns:caldav")
public class CalendarQuery {

    @JacksonXmlProperty(localName = "prop", namespace = "DAV:")
    private CalendarQueryProperty property;

    @JacksonXmlProperty(localName = "comp-filter", namespace = "urn:ietf:params:xml:ns:caldav")
    @JacksonXmlElementWrapper(useWrapping = true, localName = "filter", namespace = "urn:ietf:params:xml:ns:caldav")
    private List<Filter> filters;

    public CalendarQueryProperty getProperty() {
        return property;
    }

    public void setProperty(CalendarQueryProperty property) {
        this.property = property;
    }

    public CalendarQuery() {
        this.filters = new ArrayList<>();
        this.filters.add(new CompFilter(CalendarComponentType.VCALENDAR.name()));
        this.property = new CalendarQueryProperty();
    }
}
