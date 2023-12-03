package com.cry0.calendarclient.business.client.utils;

import java.io.IOException;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class CustomStringDeserializer extends StdDeserializer<String> {

    public CustomStringDeserializer() {
        this(null);
    }
    protected CustomStringDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
        String text = p.getText();

        if (null == text || text.length() <= 2) {
            return text;
        }

        return text.substring(1, text.length() - 1);
    }
}
