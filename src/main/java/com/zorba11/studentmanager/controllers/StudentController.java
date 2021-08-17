package com.zorba11.studentmanager.controllers;

import com.zorba11.studentmanager.enitities.Gender;
import com.zorba11.studentmanager.enitities.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/students")
public class StudentController
{
    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> students = Arrays.asList(
                new Student(1L, "Jamila", "jamila@youcode.com", Gender.FEMALE),
                new Student(2L, "Tom", "toma@youcode.com", Gender.MALE),
                new Student(3L, "Wozniak", "woz@youcode.com", Gender.MALE)
        );

        return students;
    }
}
