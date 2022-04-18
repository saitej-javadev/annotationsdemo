package com.saitej.annotationsdemo.connections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbConnection {
    
    @Value("${db.url}")
    private String dbUrl;

    public String getDbUrl() {
        return dbUrl;
    }
}
