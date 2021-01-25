package com.assgn5.dto;

import com.assgn5.model.Category;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryRequest {
    private Long id;
    private String name;

    public Category from() {
        return Category.builder().name(this.name).build();
    }
}
