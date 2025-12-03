package com.example.doan.controller;

import com.example.doan.dao.CategoryDAOImp;
import com.example.doan.entity.Category;
import com.example.doan.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/admin/category")
public class CategoryController {
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/category-list")
    public String list(Model model) {
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        return "admin/category/category-list";
    }
    @GetMapping("/create")
    public String insert(Model model){
        Category category = new Category();
        model.addAttribute("category", category);
        return "admin/category/category-create-form";
    }
    @GetMapping("/edit-form")
    public String editForm(@RequestParam("id") int id, Model model, org.springframework.web.servlet.mvc.support.RedirectAttributes ra){
        Category category = categoryService.findById(id);
        if (category == null) {
            ra.addFlashAttribute("errorMessage", "Không tìm thấy danh mục với ID=" + id);
            return "redirect:/admin/category/category-list";
        }
        model.addAttribute("category", category);
        return "admin/category/category-edit-form";
    }
    @PostMapping("/save")
    public String save(Category category){
        categoryService.save(category);
        return "redirect:/admin/category/category-list";
    }
    @PostMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id, RedirectAttributes ra) {
        try {
            categoryService.deleteById(id);
            ra.addFlashAttribute("success", "Xóa danh mục thành công!");
        } catch (Exception e) {
            ra.addFlashAttribute("error", "Không thể xóa danh mục này!");
        }
        return "redirect:/admin/category/category-list";
    }
}
