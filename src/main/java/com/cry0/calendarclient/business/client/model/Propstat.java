package com.cry0.calendarclient.business.client.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "propstat")
public class Propstat {
    @JacksonXmlProperty(localName = "prop")
    Prop prop;

    @JacksonXmlProperty(localName = "status")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Propstat() {
    }

    public Propstat(Prop prop, String status) {
        this.prop = prop;
        this.status = status;
    }

    public void setProp(Prop prop) {
        this.prop = prop;
    }

    public Prop getProp() {
        return prop;
    }
}
