package com.greenfox.trial_exam.services;

import com.greenfox.trial_exam.models.URL;

import java.util.Collection;

public interface URLService {

    Collection<URL> findAll();
    void save(URL url);
    void delete(long id);
    void selectedExisting(long id);
    long getId(URL url);
    boolean checkIfAliasExists(URL url);

}
