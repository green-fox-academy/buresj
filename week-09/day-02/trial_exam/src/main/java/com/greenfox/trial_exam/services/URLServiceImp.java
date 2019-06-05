package com.greenfox.trial_exam.services;

import com.greenfox.trial_exam.models.URL;
import com.greenfox.trial_exam.repositories.URLRepo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
@Getter
@Setter
public class URLServiceImp implements URLService {

    private URLRepo repo;
    private List<String> errors;

    @Autowired
    public URLServiceImp(URLRepo repo) {
        this.repo = repo;
        this.errors = new ArrayList<>();
    }

    @Override
    public Collection<URL> findAll() {
        return repo.findAll();
    }

    @Override
    public void save(URL url) {
        if (checkIfAliasExists(url)) {
            repo.save(url);
        } else {
            selectedExisting(getId(url));
            errors.add("Alias already used!");
        }
    }

    @Override
    public void delete(long id) {
        repo.deleteById(id);
    }

    @Override
    public void selectedExisting(long id) {
        Optional<URL> url = repo.findById(id);
        url.ifPresent(URL::incrementHitCount);
        save(url.get());
    }

    @Override
    public long getId(URL url) {
        Optional<URL> sameUrl = repo.findAll()
                .stream()
                .filter(u -> u.equals(url))
                .findFirst();
        return sameUrl.get().getId();
    }

    @Override
    public boolean checkIfAliasExists(URL url) {
        return repo.findAll()
                .stream()
                .anyMatch(u -> u.getAlias()
                        .equals(url.getAlias()));
    }
}
