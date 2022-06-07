package com.example.springboot.controller;

import com.example.springboot.model.Student;
import com.example.springboot.service.StudentService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/student/{id}")
    public Student findStudentById(@PathVariable Integer id){
        return studentService.findStudentById(id);
    }

    @PutMapping("/student/{id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable Integer id){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public Student deleteStudent(@PathVariable Integer id){
        return studentService.deleteStudent(id);
    }

    @GetMapping("/student")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

}
