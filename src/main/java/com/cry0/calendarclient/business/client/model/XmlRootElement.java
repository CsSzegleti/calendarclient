package com.cry0.calendarclient.business.client.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public abstract class XmlRootElement {
    private final String davXmlns = "DAV:";
    private final String csXmlns = "http://calendarserver.org/ns/";
    private final String icalXmlns = "http://apple.com/ns/ical/";
    private final String cXmlns = "urn:ietf:params:xml:ns:caldav";

    @JacksonXmlProperty(localName = "xmlns", isAttribute = true)
    protected String getDavXmlns() {
        return davXmlns;
    }

    @JacksonXmlProperty(localName = "xmlns:cs", isAttribute = true)
    protected String getCsXmlns() {
        return csXmlns;
    }

    @JacksonXmlProperty(localName = "xmlns:ical", isAttribute = true)
    protected String getIcalXmlns() {
        return icalXmlns;
    }

    @JacksonXmlProperty(localName = "xmlns:c", isAttribute = true)
    protected String getCXmlns() {
        return cXmlns;
    }
}
