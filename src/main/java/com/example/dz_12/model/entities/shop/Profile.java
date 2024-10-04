package com.example.dz_12.model.entities.shop;

import com.example.dz_12.model.BaseEntity;
import com.example.dz_12.model.secuirty.ApplicationUser;
import jakarta.persistence.*;
import lombok.*;


import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@Entity
@Table(name = "profile_t")
@AllArgsConstructor
@NoArgsConstructor
public class Profile extends BaseEntity {
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @OneToOne(mappedBy = "profile", cascade = CascadeType.ALL)
    private ApplicationUser user;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id")
    private Set<Order> orders;

    public Profile(String email, ApplicationUser user) {
        this.name = "";
        this.email = email;
        this.user = user;
        this.orders = new HashSet<>();
    }
}
