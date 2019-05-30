package com.greenfox.todomysql.repositories;

import com.greenfox.todomysql.entities.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<Todo, Long> {

}
