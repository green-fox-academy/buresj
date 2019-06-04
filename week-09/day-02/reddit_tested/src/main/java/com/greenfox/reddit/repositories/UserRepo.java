package com.greenfox.reddit.repositories;

import com.greenfox.reddit.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {

}
