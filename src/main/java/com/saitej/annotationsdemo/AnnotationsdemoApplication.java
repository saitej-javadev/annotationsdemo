package com.saitej.annotationsdemo;

import com.saitej.annotationsdemo.connections.DbConnection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AnnotationsdemoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(AnnotationsdemoApplication.class, args);
        DbConnection bean = run.getBean(DbConnection.class);
        System.out.println(bean.getDbUrl());
    }

}
