package com.greenfox.reddit.repositories;

import com.greenfox.reddit.entities.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface PostsRepo extends CrudRepository<Post, Long> {

    @Query(value = "SELECT * FROM posts ORDER BY votes DESC LIMIT 5", nativeQuery = true)
    Collection<Post> orderedPosts();

    @Query(value = "SELECT * FROM posts ORDER BY created", nativeQuery = true)
    Collection<Post> all();
}
