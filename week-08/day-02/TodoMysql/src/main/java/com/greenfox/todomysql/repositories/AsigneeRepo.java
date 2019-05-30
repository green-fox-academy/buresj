package com.greenfox.todomysql.repositories;

import com.greenfox.todomysql.entities.Asignee;
import org.springframework.data.repository.CrudRepository;

public interface AsigneeRepo extends CrudRepository<Asignee, Long> {
}
