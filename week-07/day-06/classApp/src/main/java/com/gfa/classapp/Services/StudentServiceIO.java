package com.gfa.classapp.Services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("IO")
public class StudentServiceIO implements StudentServiceProvider {

    private Path path;

    public StudentServiceIO() {
        this.path = Paths.get("assets/" + "students.txt");
    }

    @Override
    public List<String> findAll() {
        List<String> content = new ArrayList<>();

        try {
            content = Files.readAllLines(this.path);
        } catch (IOException e) {
            System.out.println("Cannot read file");
        }
        return content;
    }

    @Override
    public void save(String student) {
        List<String> content = findAll();
        content.add(student);
        try {
            Files.write(path, content);
        } catch (IOException e) {
            System.out.println("Cannot write file.");
        }
    }

    @Override
    public String count() {
        return String.valueOf(findAll().size());
    }

    @Override
    public String checker(String name) {
        String checker;
        if (findAll().contains(name)) {
            checker = "Student is in the list";
        } else {
            checker = "Student is not in the list";
        }
        return checker;
    }
}
