package com.cry0.calendarclient.business.client.utils;

import java.io.IOException;

import com.cry0.calendarclient.business.client.model.CalendarEntity;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class CalendarEntityDeserializer extends StdDeserializer<CalendarEntity>{
    
    public CalendarEntityDeserializer(){
        this(null);
    }

    protected CalendarEntityDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public CalendarEntity deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deserialize'");
    }
    
}
