package com.example.doan.web;

import com.example.doan.dao.CategoryDAOImp;
import com.example.doan.entity.Category;
import groovy.transform.Final;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/category")
public class CategoryController {
    @Autowired
    private CategoryDAOImp categoryDAOImp;

    @GetMapping({"", "/", "/category-list"})
    public String list(Model model){
        List<Category> categories = categoryDAOImp.findAll();
        model.addAttribute("categories", categories);
        return "admin/category/category-list";
    }
}
