package com.ps.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder dataBuilder=DataSourceBuilder.create();
        dataBuilder.url("jdbc:mysql://localhost:3306/conference_demo");
        System.out.println("Builder has started");
        return dataBuilder.build();
    }
}
