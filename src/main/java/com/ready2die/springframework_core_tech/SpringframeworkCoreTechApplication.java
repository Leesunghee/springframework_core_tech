package com.ready2die.springframework_core_tech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
@EnableAsync
public class SpringframeworkCoreTechApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringframeworkCoreTechApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
//        SpringApplication.run(SpringframeworkCoreTechApplication.class, args);
    }

}


