package com.greenfox.todomysql.repositories;

import com.greenfox.todomysql.entities.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;


@Qualifier("user")
public interface UserRepo extends CrudRepository<User, Long> {
}

