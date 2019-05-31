package com.greenfox.reddit.repositories;

import com.greenfox.reddit.entities.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostsRepo extends CrudRepository<Post, Long> {
}
