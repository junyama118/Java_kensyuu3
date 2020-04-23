package com.example.demo.repository;

import com.example.demo.domain.Product;
import com.example.demo.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;


@Component
@Mapper
public interface StudentRepository {

    @Select("SELECT * FROM students")
    @Results(id = "st", value = {
            @Result(column = "japanese_score", property = "japanese_score"),
            @Result(column = "math_score", property = "math_score"),
            @Result(column = "science_score", property = "science_score"),
            @Result(column = "society_score", property = "society_score"),
            @Result(column = "english_score", property = "english_score"),
            @Result(column = "created_at", property = "created_at"),
            @Result(column = "updated_at", property = "updated_at") })
    ArrayList<Student> findAll();
}
