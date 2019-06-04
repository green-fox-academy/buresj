package com.greenfox.reddit.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue
    private long id;

    private String title;
    private String content;
    private int votes;

    @CreationTimestamp
    private Date created;

    @ManyToOne
    private User user;

    public void decrement(){
        this.votes--;
    }

    public void increment(){
        this.votes++;
    }
}
