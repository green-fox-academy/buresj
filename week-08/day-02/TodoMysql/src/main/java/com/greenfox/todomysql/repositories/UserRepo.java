package com.greenfox.todomysql.repositories;

import com.greenfox.todomysql.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}

