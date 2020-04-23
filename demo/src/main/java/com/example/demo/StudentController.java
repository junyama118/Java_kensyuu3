package com.example.demo;

import com.example.demo.domain.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        ArrayList<Student> byId2 = studentRepository.findByName("三原 菜奈");
        model.addAttribute("student", byId2.orElse(new Student()));
        return "student";
    }
}
