package com.example.dz_12.model.entities.itemAttributes;

import java.util.List;

public enum Size {
    HATS(List.of("S", "M", "L")),
    CLOTHES(List.of("XS", "S", "M", "L", "XL")),
    SHOES(List.of("36", "37", "38", "39", "40", "41", "42", "43", "44"));

    private final List<String> sizes;

    public List<String> getSizes() {
        return sizes;
    }

    Size(List<String> sizes) {
        this.sizes = sizes;
    }
}
