package com.example.dz_12.model.entities.shop;

import com.example.dz_12.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;


import java.util.Set;

@Getter
@Setter
@Builder
@Entity
@Table(name = "order_t")
@AllArgsConstructor
@NoArgsConstructor
public class Order extends BaseEntity {
    @Column(name = "isPaid")
    private Boolean isPaid;
    @ManyToOne
    private Profile profile;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private Set<OrderPosition> positions;
}
