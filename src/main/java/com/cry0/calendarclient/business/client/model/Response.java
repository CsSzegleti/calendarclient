package com.cry0.calendarclient.business.client.model;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Response {

    @JacksonXmlProperty(localName = "href")
    private String href;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Propstat> propstat;

    public String getHref() {
        return href;
    }

    public List<Propstat> getPropstat() {
        return propstat;
    }

    public Response() {
    }

    public Response(String href, List<Propstat> propstat) {
        this.href = href;
        this.propstat = propstat;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public void setPropstat(List<Propstat> propstat) {
        this.propstat = propstat;
    }

}