package com.melon.sell.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Date;

/**
 * ClassName Date2LongSerializer
 * Description
 * Author melon
 * Date 2019-07-03 16:05
 * Version
 */

public class Date2LongSerializer extends JsonSerializer<Date> {
    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
         jsonGenerator.writeNumber(date.getTime() / 1000 ) ;
    }
}
