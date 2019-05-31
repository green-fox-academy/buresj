package com.greenfox.reddit.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

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

    public void decrement(){
        this.votes--;
    }

    public void increment(){
        this.votes++;
    }
}
