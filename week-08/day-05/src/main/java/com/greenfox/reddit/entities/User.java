package com.greenfox.reddit.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private long id;

    private String username;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;


    public User(long id, String username, String password, List<Post> posts) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.posts = posts;
    }
}
