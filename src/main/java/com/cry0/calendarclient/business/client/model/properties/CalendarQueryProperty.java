package com.cry0.calendarclient.business.client.model.properties;

import com.cry0.calendarclient.business.client.model.constant.Namespace;
import com.cry0.calendarclient.business.client.model.constant.PropertyName;
import com.cry0.calendarclient.business.client.utils.CustomStringDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class CalendarQueryProperty {

    @JacksonXmlProperty(localName = PropertyName.GET_ETAG, namespace = Namespace.DAV)
    @JsonDeserialize(using = CustomStringDeserializer.class)
    private String etag;

    @JacksonXmlProperty(localName = PropertyName.CALENDAR_DATA, namespace = Namespace.C)
    private String calendarData;

}
