package com.greenfox.todomysql.repositories;

import com.greenfox.todomysql.entities.Todo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;

@Qualifier("todo")
public interface TodoRepo extends CrudRepository<Todo, Long> {

}
