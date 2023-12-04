package com.cry0.calendarclient.business.client.model;

import com.cry0.calendarclient.business.client.model.constant.Namespace;
import com.cry0.calendarclient.business.client.model.constant.PropertyName;
import com.cry0.calendarclient.business.client.model.properties.PropfindProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "propstat")
@JsonIgnoreProperties
public class Propstat<PropType> {
    @JacksonXmlProperty(localName = PropertyName.PROP, namespace = Namespace.DAV)
    PropType prop;

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

    public Propstat(PropType prop, String status) {
        this.prop = prop;
        this.status = status;
    }

    public void setProp(PropType prop) {
        this.prop = prop;
    }

    public PropType getProp() {
        return prop;
    }
}
