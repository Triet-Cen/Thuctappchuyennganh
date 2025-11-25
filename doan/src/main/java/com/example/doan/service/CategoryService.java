package com.example.doan.service;

import com.example.doan.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category findById(int id);
    Category save(Category category);
    void deleteById(int id);
}
