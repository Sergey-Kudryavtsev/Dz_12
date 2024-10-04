package com.example.dz_12.model.entities.stock.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryDTO {
    private int id;
    private String name;
}
