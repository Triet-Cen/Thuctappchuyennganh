package com.example.doan.web;

import com.example.doan.model.CategoryView;
import com.example.doan.model.ProductView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
    @GetMapping("/admin/category")
    public String adminCategory() {
        return "admin/category/category-list";
    }

    @GetMapping("/admin/product")
    public String adminProduct() {
        return "admin/product/product-list";
    }
}
