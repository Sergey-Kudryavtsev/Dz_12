package com.example.dz_12.dao.implementations;

import com.example.dz_12.dao.services.CategoryService;
import com.example.dz_12.model.entities.stock.entities.Category;
import com.example.dz_12.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class CategoryServiceImplementation implements CategoryService {
    private final CategoryRepository repo;

    @Override
    public List<Category> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Category> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public Category save(Category category) {
        return repo.save(category);
    }

    @Override
    public void deleteById(int id) {

    }
}
