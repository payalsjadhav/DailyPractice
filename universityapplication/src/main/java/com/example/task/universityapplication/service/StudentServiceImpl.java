package com.example.task.universityapplication.service;

import com.example.task.universityapplication.model.Student;
import com.example.task.universityapplication.repository.StudentRepository;

import java.util.Optional;

public class StudentServiceImpl implements StudentService{

    public Search(String Name){
        Optional<Student> student= StudentRepository.findbystudentname(Name);

        return Student;
    }
}
