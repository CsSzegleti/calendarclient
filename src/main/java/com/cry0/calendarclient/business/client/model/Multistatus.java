package com.cry0.calendarclient.business.client.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "multistatus")
public class Multistatus {
    @JacksonXmlProperty(localName = "response")
    private Response response;

    public Response getResponse() {
        return response;
    }
}
