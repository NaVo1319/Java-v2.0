package com.example.pr12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Pr12Application {

    public static void main(String[] args) {

        //SpringApplication.run(Pr12Application.class, args);
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(MyConfiguration.class);
        ctx.refresh();
        MyBean bean1=ctx.getBean(MyBean.class);
        MyBean bean2=ctx.getBean(MyBean.class);
        ctx.close();
    }

}
