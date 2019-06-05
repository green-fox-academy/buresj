package com.greenfox.trial_exam.repositories;

import com.greenfox.trial_exam.models.URL;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface URLRepo extends CrudRepository<URL, Long> {
    Collection<URL> findAll();
}
