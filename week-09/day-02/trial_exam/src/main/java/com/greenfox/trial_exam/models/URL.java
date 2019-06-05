package com.greenfox.trial_exam.models;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "urls")
public class URL {

    @Id @GeneratedValue long id;
    private String URL;
    private String alias;
    private String secreteCode;
    private int hitCount;

    public void incrementHitCount(){
        hitCount++;
    }
}
