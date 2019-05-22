package com.gfa.classapp.Services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("list")
public class StudentService implements StudentServiceProvider {
    ArrayList<String> names;

    public StudentService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

    public String count() {
        return String.valueOf(names.size());
    }

    public String checker(String name) {
        String checker;
        if (names.contains(name)) {
            checker = "Student is in the list";
        } else {
            checker = "Student is not in the list";
        }

        return checker;
    }
}