package com.cry0.calendarclient.business.client.model;

import com.cry0.calendarclient.business.client.model.constant.Namespace;
import com.cry0.calendarclient.business.client.model.constant.PropertyName;
import com.cry0.calendarclient.business.client.model.properties.PropfindProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "propstat")
public class Propstat {
    @JacksonXmlProperty(localName = PropertyName.PROP, namespace = Namespace.DAV)
    PropfindProperty prop;

    @JacksonXmlProperty(localName = PropertyName.STATUS, namespace = Namespace.DAV)
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Propstat() {
    }

    public Propstat(PropfindProperty prop, String status) {
        this.prop = prop;
        this.status = status;
    }

    public void setProp(PropfindProperty prop) {
        this.prop = prop;
    }

    public PropfindProperty getProp() {
        return prop;
    }
}
