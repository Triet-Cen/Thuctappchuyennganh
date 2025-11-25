package com.example.doan.web;


import com.example.doan.entity.Category;
import com.example.doan.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final CategoryService categoryService;

    @Autowired
    public AdminController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("")
    public String admin() {
        return "admin";
    }

    @GetMapping("/category")
    public String list(Model model){
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        return "admin/category/category-list";
    }

    @GetMapping("/product")
    public String adminProduct() {
        return "admin/product/product-list";
    }


}
