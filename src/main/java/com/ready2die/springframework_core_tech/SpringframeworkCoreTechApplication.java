package com.ready2die.springframework_core_tech;

import com.ready2die.out.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.Arrays;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringframeworkCoreTechApplication {

    @Autowired
    MyService myService;

    public static void main(String[] args) {

//        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
////        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        System.out.println(Arrays.toString(beanDefinitionNames));
//        BookService bookService = (BookService) context.getBean("bookService");
//        System.out.println(bookService.bookRepository != null);

//        SpringApplication.run(SpringframeworkCoreTechApplication.class, args);



        var app = new SpringApplication(SpringframeworkCoreTechApplication.class);
        app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
            ctx.registerBean(MyService.class);
            ctx.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("Functional Bean Definition!!"));
        });

        app.run(args);

    }

}

