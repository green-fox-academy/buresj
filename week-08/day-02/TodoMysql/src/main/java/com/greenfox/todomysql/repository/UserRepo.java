package com.greenfox.todomysql.repository;

import com.greenfox.todomysql.entities.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
@Qualifier("user")
public interface UserRepo extends CrudRepository<User, Long> {
}

