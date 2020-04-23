package com.example.demo.repository;

import com.example.demo.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Mapper
public interface ProductRepository {

    @Select("SELECT id, product_code, name, col FROM product WHERE id = #{id}")
    Optional<Product> findById(int id);

}