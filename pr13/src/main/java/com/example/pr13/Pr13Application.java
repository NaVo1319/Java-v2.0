package com.example.pr13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Pr13Application {

    public static void main(String[] args) {

        //SpringApplication.run(Pr12Application.class, args);
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(MyConfiguration.class);
        ctx.refresh();
        MyBean bean1=ctx.getBean(MyBean.class);
        ctx.close();
    }

}
