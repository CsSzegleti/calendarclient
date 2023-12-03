package com.cry0.calendarclient.business.client.model;

public class PropertyFactory {

    public static Property<?> createProperty(String propertyName) {
        return switch (propertyName) {
            case Property.DISPLAY_NAME -> new Property<String>(Property.DISPLAY_NAME, null, null);
            case Property.GET_ETAG -> new Property<String>(Property.GET_ETAG, null, null);
            case Property.GET_CTAG -> new Property<String>(Property.GET_CTAG, null, "cs");
            case Property.CALENDAR_COLOR -> new Property<String>(Property.CALENDAR_COLOR, null, "ical");
            case Property.GET_LAST_MODIFIED -> new Property<>(Property.GET_LAST_MODIFIED, null, null);
            case Property.SUPPORTED_CALENDAR_COMPONENT_SET -> new Property<>(Property.SUPPORTED_CALENDAR_COMPONENT_SET, null, "c");
            default -> throw new RuntimeException();
        };
    }
}
