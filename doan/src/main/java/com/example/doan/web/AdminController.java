package com.example.doan.web;


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

    @GetMapping("/admin/product")
    public String adminProduct() {
        return "admin/product/product-list";
    }
}
