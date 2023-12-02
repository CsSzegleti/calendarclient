package com.cry0.calendarclient.business.client.model;

public class Property<T> {
    public static final String PRINCIPAL_COLLECTION_SET = "principal-collection-set";
    public static final String CURRENT_USER_PRINCIPAL = "current-user-principal";
    public static final String CURRENT_USER_PRIVILEGE_SET = "current-user-privilege-set";
    public static final String SUPPORTED_REPORT_SET = "supported-report-set";
    public static final String SUPPORTED_REPORT = "supported-report";
    public static final String RESOURCE_TYPE = "resourcetype";
    public static final String OWNER = "owner";
    public static final String GET_ETAG = "getetag";
    public static final String GET_CTAG = "getctag";
    public static final String GET_LAST_MODIFIED = "getlastmodified";
    public static final String GET_CONTENT_TYPE = "getcontenttype";
    public static final String GET_CONTENT_LENGTH = "getcontentlength";
    public static final String DISPLAY_NAME = "displayname";
    public static final String SYNC_TOKEN = "sync-token";
    public static final String SUPPORTED_CALENDAR_COMPONENT_SET = "supported-calendar-component-set";
    public static final String CALENDAR_COLOR = "calendar-color";

    private String name;
    private T value;
    private String nameSpace;
    
    Property(String name, T value, String nameSpace) {
        this.name = name;
        this.value = value;
        this.nameSpace = nameSpace;
    }
    public String getName() {
        return name;
    }

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public String getNameSpace() {
        return nameSpace;
    }
    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }
    
}
