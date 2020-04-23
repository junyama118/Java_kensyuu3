package com.example.demo;

import com.example.demo.domain.Product;
import com.example.demo.domain.Student;
import com.example.demo.repository.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class ProductController {

    private final ProductRepository productRepository;
    private final StudentRepository studentRepository;

    public ProductController(ProductRepository productRepository, StudentRepository studentRepository) {
        this.productRepository = productRepository;
        this.studentRepository = studentRepository;
    }


    @GetMapping("/product")
    public String index(Model model) {
        Optional<Product> byId = productRepository.findById(1);
        model.addAttribute("product", byId.orElse(new Product()));
        return "product";
    }

}