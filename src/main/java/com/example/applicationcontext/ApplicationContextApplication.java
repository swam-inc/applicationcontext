package com.example.applicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.w3c.dom.ls.LSOutput;

@SpringBootApplication
@Configuration
@PropertySource("classpath:static/resource.properties")

public class ApplicationContextApplication {
    @Autowired
    Environment environment;

    @Value("${db.var1}")
    private String var1;
    @Value("${db.var2}")
    private String var2;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void test(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationContextApplication.class);
        Environment env = ctx.getBean(Environment.class);
        System.out.println(env.toString());
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(env.getProperty("db.var1"));
        System.out.println(env.getProperty("db.var2"));
    }
    public static void main(String[] args) {
        //SpringApplication.run(ApplicationContextApplication.class, args);
        ApplicationContextApplication application = new ApplicationContextApplication();
        application.test();

    }

}
