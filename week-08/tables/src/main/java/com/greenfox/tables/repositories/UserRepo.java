package com.greenfox.tables.repositories;

import com.greenfox.tables.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}
