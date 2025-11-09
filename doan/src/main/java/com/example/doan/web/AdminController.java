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
    public String admin(Model model) {
        List<CategoryView> categories = Arrays.asList(
                new CategoryView(1L, "Điện thoại", 120, "Hoạt động"),
                new CategoryView(2L, "Laptop", 75, "Hoạt động"),
                new CategoryView(3L, "Phụ kiện", 230, "Tạm dừng"),
                new CategoryView(4L, "Âm thanh", 54, "Hoạt động"),
                new CategoryView(5L, "Smart Home", 33, "Hoạt động")
        );

        List<ProductView> products = Arrays.asList(
                new ProductView(101L, "iPhone 15", 15, "Còn hàng"),
                new ProductView(102L, "Samsung Galaxy S24", 12, "Còn hàng"),
                new ProductView(103L, "MacBook Air M3", 7, "Còn hàng"),
                new ProductView(104L, "Tai nghe Sony WH-1000XM5", 20, "Còn hàng"),
                new ProductView(105L, "Chuột Logitech MX Master 3S", 18, "Sắp hết")
        );

        model.addAttribute("categories", categories);
        model.addAttribute("products", products);
        return "admin"; // templates/admin.html
    }
}
