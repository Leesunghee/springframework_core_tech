package com.ready2die.springframework_core_tech;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface BookRepository {

    Book save(Book book);

}
