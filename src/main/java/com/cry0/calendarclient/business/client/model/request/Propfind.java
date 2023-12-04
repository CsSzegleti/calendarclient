package com.cry0.calendarclient.business.client.model.request;

import com.cry0.calendarclient.business.client.model.constant.Namespace;
import com.cry0.calendarclient.business.client.model.constant.PropertyName;
import com.cry0.calendarclient.business.client.model.properties.PropfindProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = PropertyName.PROPFIND, namespace = Namespace.DAV)
public class Propfind {
    
    @JacksonXmlProperty(localName = PropertyName.PROP, namespace = Namespace.DAV)
    private PropfindProperty property;

    public PropfindProperty getProperty() {
        return property;
    }

    public void setProperty(PropfindProperty property) {
        this.property = property;
    }

    public Propfind() {
        this.property = new PropfindProperty();
    }
}
