package com.gfa.classapp.Services;

import java.util.List;

public interface StudentServiceProvider {

    List<String> findAll();

    void save(String student);

    String count();

    String checker(String name);
}
