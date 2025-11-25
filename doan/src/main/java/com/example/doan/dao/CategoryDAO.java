package com.example.doan.dao;

import com.example.doan.entity.Category;

import java.util.List;

public interface CategoryDAO {
    List <Category> findAll();
    Category findById(int id);
    Category save(Category category);
    void deleteById(int id);
}
