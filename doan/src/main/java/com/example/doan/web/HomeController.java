package com.example.doan.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }
    @GetMapping("/store")
    public String store() {
        return "store";
    }
    @GetMapping("/checkout")
    public String checkout() {
        return "checkout";
    }
    @GetMapping("/product")
    public String product() {
        return "product";
    }
    @GetMapping("/about")
    public String about() { return "about"; }
}
