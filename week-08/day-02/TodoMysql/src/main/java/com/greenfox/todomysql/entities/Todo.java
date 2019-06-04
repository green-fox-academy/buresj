package com.greenfox.todomysql.entities;

import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Todo {

    @Id
    @GeneratedValue
    private long id;

    private long userId;
    private String title;
    private boolean urgent;
    private boolean done = false;

    @ManyToOne(fetch = FetchType.LAZY)
    private Assignee assignee;

    @CreationTimestamp
    private Date created;

    public Todo(){
    }

    public Todo(String title) {
        this.title = title;
    }

    public void setUserId(long userID) {
        this.userId = userID;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public long getUserId() {
        return userId;
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

    @Override
    public String toString() {
        return "Task: " + title + ", "
                + "Urgent: " + urgent + ", " +
                "Done: " + done;
    }


    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }
}
