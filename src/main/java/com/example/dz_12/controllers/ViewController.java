package com.example.dz_12.controllers;

import com.example.dz_12.dao.services.CategoryService;
import com.example.dz_12.model.entities.stock.dto.CategoryDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class ViewController {
    private final CategoryService categoryService;

    @GetMapping
    public String index(Model model) {
        List<CategoryDTO> categories = categoryService.findAll().stream()
                .map(category -> CategoryDTO.builder()
                        .id(category.getId())
                        .name(category.getName())
                        .build())
                .toList();

        model.addAttribute("categories", categories);
        return "ui/pages/index";
    }
}
