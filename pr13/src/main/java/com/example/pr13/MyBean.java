package com.example.pr13;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import javax.annotation.PreDestroy;
@Component
public class MyBean {
    @Value("${student.name}") String name;
    @Value("${student.last_name}") String last_name;
    @Value("${student.group}") String group;
    @PreDestroy
    private void print() {
        System.out.println(name+" "+last_name+" "+group);
    }
}
