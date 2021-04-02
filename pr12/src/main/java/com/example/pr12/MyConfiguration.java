package com.example.pr12;

import org.springframework.context.annotation.Bean;

public class MyConfiguration {
    @Bean
    public MyBean myBean(){
        return new MyBean();
    }
}
