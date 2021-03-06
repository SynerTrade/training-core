package com.synertrade.training.core.configuration;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by tudorg on 10/17/2016.
 */
@SpringBootApplication(scanBasePackages = {"com.synertrade.training.core"})
@PropertySource("classpath:trainingcore.properties")
public class TrainingCoreApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(TrainingCoreApplication.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
