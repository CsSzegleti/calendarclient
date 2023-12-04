package com.cry0.calendarclient.business.client.model.properties;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Property {

    @JacksonXmlProperty(localName = "getetag", namespace = "DAV:")
    private String etag;

    @JacksonXmlProperty(localName = "calendar-data", namespace = "urn:ietf:params:xml:ns:caldav")
    private String calendarData;

}
