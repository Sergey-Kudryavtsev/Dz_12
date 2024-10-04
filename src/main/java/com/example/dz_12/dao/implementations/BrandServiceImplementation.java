package com.example.dz_12.dao.implementations;

import com.example.dz_12.dao.services.BrandService;
import com.example.dz_12.model.entities.stock.entities.Brand;
import com.example.dz_12.repositories.BrandRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BrandServiceImplementation implements BrandService {
    private final BrandRepository repo;

    @Override
    public List<Brand> findAll() {
        return null;
    }

    @Override
    public Optional<Brand> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public Brand save(Brand brand) {
        return repo.save(brand);
    }

    @Override
    public void deleteById(int id) {

    }
}
