package com.example.doan.dao;

import com.example.doan.entity.Category;
import com.example.doan.entity.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> findAll();
    Product findById(int id);
    Product save(Product product);
    void deleteById(int id);
}
