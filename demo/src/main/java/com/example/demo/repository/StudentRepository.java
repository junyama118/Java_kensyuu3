package com.example.demo.repository;

import com.example.demo.domain.Product;
import com.example.demo.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;


@Component
@Mapper
public interface StudentRepository {

    @Select("SELECT * FROM students")
    ArrayList<Student> findAll();
}
