package com.example.dz_12.repositories;


import com.example.dz_12.model.entities.stock.entities.StockPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockPositionRepository extends JpaRepository<StockPosition, Integer> {
}
