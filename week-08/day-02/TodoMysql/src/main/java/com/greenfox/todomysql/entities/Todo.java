package com.greenfox.todomysql.entities;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.sql.Date;

@Entity
public class Todo {

    @Id
    @GeneratedValue
    private long id;

    private String title;
    private boolean urgent;
    private boolean done = false;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    private String user;

    @CreationTimestamp
    private Date created;

    public Todo() {
    }

    public Date getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Task: " + title + ", "
                + "Urgent: " + urgent + ", " +
                "Done: " + done;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
