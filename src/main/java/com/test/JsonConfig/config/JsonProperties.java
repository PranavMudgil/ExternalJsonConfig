package com.test.JsonConfig.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.test.JsonConfig.propertySource.ConfigSourceFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;


@Configuration
@ConfigurationProperties
@PropertySource(value= "classpath: application.properties",factory = ConfigSourceFactory.class)
@Order(Ordered.HIGHEST_PRECEDENCE)
public class JsonProperties {

    private String message;

    private String appName;

    private int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }


   public  JsonProperties(){

    }
}
