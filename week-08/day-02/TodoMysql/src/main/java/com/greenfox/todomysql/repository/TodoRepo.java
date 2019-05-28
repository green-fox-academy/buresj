package com.greenfox.todomysql.repository;

import com.greenfox.todomysql.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<Todo, Long> {

}
