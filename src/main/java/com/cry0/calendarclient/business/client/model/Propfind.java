package com.cry0.calendarclient.business.client.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "propfind")
public class Propfind {
    @JsonIgnore
    private List<Property<?>> properties;


    public List<Property<?>> getProperties() {
        return properties;
    }

    public Propfind() {
        this.properties = new ArrayList<>();
    }



    public void addProperty(Property<?> property) {
        this.properties.add(property);
    }

    @JacksonXmlProperty(localName = "prop")
    private Map<String, String> mapify() {
        Map<String, String> map = new HashMap<>();
        for (Property<?> property : properties) {
            if (null != property.getNameSpace() && !property.getNameSpace().isBlank()) {
                map.put(String.format("%s:%s", property.getNameSpace(), property.getName()), null == property.getValue() ? null : property.getValue().toString());
            } else {
                map.put(property.getName(), null == property.getValue() ? null : property.getValue().toString());
            }
        }

        return map;
    }

}
