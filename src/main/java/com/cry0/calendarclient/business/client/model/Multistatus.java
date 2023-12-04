package com.cry0.calendarclient.business.client.model;

import java.util.List;

import com.cry0.calendarclient.business.client.model.constant.Namespace;
import com.cry0.calendarclient.business.client.model.constant.PropertyName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = PropertyName.MULTISTATUS, namespace = Namespace.DAV)
public class Multistatus<PropType> {
    @JacksonXmlProperty(localName = PropertyName.RESPONSE, namespace = Namespace.DAV)
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Response<PropType>> response;

    public List<Response<PropType>> getResponse() {
        return response;
    }

    public void setResponse(List<Response<PropType>> response) {
        this.response = response;
    }
}
