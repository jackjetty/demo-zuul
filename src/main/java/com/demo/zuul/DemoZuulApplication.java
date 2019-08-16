package com.demo.zuul;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
@EnableZuulProxy
public class DemoZuulApplication  {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoZuulApplication.class, args);
    }
}