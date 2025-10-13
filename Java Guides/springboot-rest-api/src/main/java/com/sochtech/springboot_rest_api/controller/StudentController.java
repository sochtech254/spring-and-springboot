package com.sochtech.springboot_rest_api.controller;

import com.sochtech.springboot_rest_api.bean.Student;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController
{
    // http://localhost:8080/student
    @GetMapping("student")
    public Student getStudent()
    {
        Student student = new Student(1, "Stephen", "Chege");

        return student;
    }

    // http://localhost:8080/students
    @GetMapping("students")
    public List<Student> getStudents()
    {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Stephen", "Chege"));
        students.add(new Student(2, "Outhan", "Chazima"));
        students.add(new Student(3, "Lisper", "Wawira"));
        students.add(new Student(4, "Roy", "Kago"));
        return students;
    }

    // Spring BOOT REST API with Path Variable
    // {id} - URI template variable
    // http://localhost:8080/students/1/Stephen/Chege
    @GetMapping("students/{id}")
    public Student studentPathVariable(@PathVariable("id") int studentId,
                                       @PathVariable("first-name") String firstName,
                                       @PathVariable("last-name") String lastName)
    {
        return new Student(studentId, firstName, lastName);
    }

    // Spring boot REST API with Request Param
    // http://localhost:8080/students/query?id=1&firstName=Stephen&lastName=Chege
    @GetMapping("students/query")
    public Student studentRequestVariable(@RequestParam int id,
                                          @RequestParam String firstName,
                                          @RequestParam String lastName)
    {
        return new Student(id, firstName, lastName);
    }


}
