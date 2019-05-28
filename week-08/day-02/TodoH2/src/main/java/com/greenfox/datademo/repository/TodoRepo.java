package com.greenfox.datademo.repository;

import com.greenfox.datademo.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<Todo, Long> {

}
