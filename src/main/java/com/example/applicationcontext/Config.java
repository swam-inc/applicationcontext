package com.example.applicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "com.example.applicationcontext")
@PropertySource("classpath:static/resource.properties")
public class Config {
    @Autowired
    Environment environment;

    @Value("${db.var1}")
    private String var1;
    @Value("${db.var2}")
    private String var2;

    public void test(){
        System.out.println(var1);
        System.out.println(var2);
//        System.out.println(environment.getActiveProfiles());
    }
}
