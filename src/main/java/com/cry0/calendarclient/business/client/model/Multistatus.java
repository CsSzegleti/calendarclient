package com.cry0.calendarclient.business.client.model;

import com.cry0.calendarclient.business.client.model.constant.Namespace;
import com.cry0.calendarclient.business.client.model.constant.PropertyName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = PropertyName.MULTISTATUS, namespace = Namespace.DAV)
public class Multistatus {
    @JacksonXmlProperty(localName = PropertyName.RESPONSE, namespace = Namespace.DAV)
    private Response response;

    public Response getResponse() {
        return response;
    }
}
