package com.ready2die.springframework_core_tech;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = SpringframeworkCoreTechApplication.class)
public class ApplicationConfig {

//    @Bean
//    public BookRepository bookRepository() {
//        return new BookRepository();
//    }
//
//    @Bean  //setter 가 있는 경우에는 @Autowired 로 의존성 주입을 받을 수 있지만 없는 경우 생성자에 의존성 주입을 해줘야 함.
//    public BookService bookService() {
//        return new BookService();
//    }
//
////    @Bean
////    public BookService bookService() {
////        BookService bookService = new BookService();
////        bookService.setBookRepository(bookRepository());
////        return bookService;
////    }
//
//    @Bean
//    public BookService bookService(BookRepository bookRepository) {
//        BookService bookService = new BookService();
//        bookService.setBookRepository(bookRepository);
//        return bookService;
//    }


}
