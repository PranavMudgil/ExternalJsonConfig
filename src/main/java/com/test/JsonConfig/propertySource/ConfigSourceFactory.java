package com.test.JsonConfig.propertySource;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

import java.io.IOException;
import java.net.URL;
import java.util.Map;


public class ConfigSourceFactory implements PropertySourceFactory {


    @Override
    public PropertySource<?> createPropertySource(String s, EncodedResource resource) throws IOException {

        Map readValue = new ObjectMapper()
                .readValue(new URL(new URL("http://localhost:8082/"), "getConfig/"), Map.class);

        return new MapPropertySource("json-property", readValue);
    }
}
