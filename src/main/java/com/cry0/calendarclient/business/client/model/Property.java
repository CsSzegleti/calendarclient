package com.cry0.calendarclient.business.client.model;


public class Property<T> {
    private String name;
    private T value;
    private String nameSpace;
    
    public Property(String name, T value, String nameSpace) {
        this.name = name;
        this.value = value;
        this.nameSpace = nameSpace;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
