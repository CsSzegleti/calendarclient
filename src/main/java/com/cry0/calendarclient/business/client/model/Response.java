package com.cry0.calendarclient.business.client.model;

import java.util.List;

import com.cry0.calendarclient.business.client.model.constant.Namespace;
import com.cry0.calendarclient.business.client.model.constant.PropertyName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Response<PropType> {

    @JacksonXmlProperty(localName = PropertyName.HREF, namespace = Namespace.DAV)
    private String href;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Propstat<PropType>> propstat;

    public String getHref() {
        return href;
    }

    public List<Propstat<PropType>> getPropstat() {
        return propstat;
    }

    public Response() {
    }

    public Response(String href, List<Propstat<PropType>> propstat) {
        this.href = href;
        this.propstat = propstat;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public void setPropstat(List<Propstat<PropType>> propstat) {
        this.propstat = propstat;
    }

}
