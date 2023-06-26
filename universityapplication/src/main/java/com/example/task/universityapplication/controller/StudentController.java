package com.example.task.universityapplication.controller;

import com.example.task.universityapplication.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;
}
