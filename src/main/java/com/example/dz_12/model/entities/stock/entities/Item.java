package com.example.dz_12.model.entities.stock.entities;


import com.example.dz_12.model.BaseEntity;
import com.example.dz_12.model.entities.itemAttributes.Sex;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@Entity
@Table(name = "item_t")
@AllArgsConstructor
public class Item extends BaseEntity {
    @Column(name = "article", unique = true)
    private String article;
    @Column(name = "model")
    private String model;
    @Column(name = "price")
    private Double price;
    @Column(name = "sex")
    @Enumerated(EnumType.STRING)
    private Sex sex;
    @ManyToOne
    private Brand brand;
    @ManyToOne
    private Category category;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id")
    private Set<StockPosition> positions;

    public Item() {
        positions = new HashSet<>();
    }
}
