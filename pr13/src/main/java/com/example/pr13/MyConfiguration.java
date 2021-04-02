package com.example.pr13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@PropertySource("application.properties")
@PropertySource("application.yml")
public class MyConfiguration {
    @Bean
    public MyBean myBean(){
        return new MyBean();
    }
}
