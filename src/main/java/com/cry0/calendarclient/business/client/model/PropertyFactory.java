package com.cry0.calendarclient.business.client.model;

public class PropertyFactory {

    public static Property<?> createProperty(String propertyName) {
        return switch(propertyName) {
            case Property.DISPLAY_NAME -> new Property<String>(Property.DISPLAY_NAME, null, null);
            case Property.GET_ETAG -> new Property<String>(Property.GET_ETAG, null, null);
            case Property.GET_CTAG -> new Property<String>(Property.GET_CTAG, null, "cs");
            default -> throw new RuntimeException();
        };
    }
}
