package com.cry0.calendarclient.business.client;

public enum CalendarMethod {
    GET("GET"),
    PUT("PUT"),
    DELETE("DELETE"),
    PROPFIND("PROPFIND"),
    PROPPATCH("PROPPATCH"),
    REPORT("REPORT"),
    MKCOL("MKCOL"),
    MKCALENDAR("MKCALENDAR"),
    ACL("ACL");

    CalendarMethod(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}