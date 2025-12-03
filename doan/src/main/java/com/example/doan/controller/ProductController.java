package com.example.doan.controller;

import com.example.doan.entity.Product;
import com.example.doan.service.CategoryServiceImp;
import com.example.doan.service.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/admin/product")
public class ProductController {

    private final ProductServiceImp productService;
    private final CategoryServiceImp categoryService;

    @Autowired
    public ProductController(ProductServiceImp productService,CategoryServiceImp categoryService) {
        this.productService = productService;
        this.categoryService= categoryService;
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categories", categoryService.findAll());
        return "admin/product/product-create-form";
    }
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model, RedirectAttributes ra) {
        Product product = productService.findById(id);
        if (product == null) {
            ra.addFlashAttribute("error", "Không tìm thấy sản phẩm!");
            return "redirect:/admin/product/product-list";
        }
        model.addAttribute("product", product);
        model.addAttribute("categories", categoryService.findAll());
        return "admin/product/product-edit-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("product") Product product, RedirectAttributes ra) {
        productService.save(product);
        ra.addFlashAttribute("success", "Thêm sản phẩm thành công!");
        return "redirect:/admin/product/product-list";
    }
    @PostMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id, RedirectAttributes ra) {
        try {
            productService.deleteById(id);
            ra.addFlashAttribute("success", "Xóa sản phẩm thành công!");
        } catch (Exception e) {
            ra.addFlashAttribute("error", "Không thể xóa sản phẩm này!");
        }
        return "redirect:/admin/product/product-list";
    }

    @GetMapping("/product-list")
    public String list(Model model) {
        model.addAttribute("products", productService.findAll());
        return "admin/product/product-list";
    }
}
