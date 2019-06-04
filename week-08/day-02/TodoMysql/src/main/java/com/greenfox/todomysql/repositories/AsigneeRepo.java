package com.greenfox.todomysql.repositories;

import com.greenfox.todomysql.entities.Assignee;
import org.springframework.data.repository.CrudRepository;

public interface AsigneeRepo extends CrudRepository<Assignee, Long> {
}
