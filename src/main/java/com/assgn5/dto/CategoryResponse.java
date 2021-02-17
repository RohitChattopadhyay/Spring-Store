package com.assgn5.dto;

import lombok.Data;

import java.util.List;

import com.assgn5.model.Category;
import com.assgn5.model.Item;

import lombok.Builder;

@Data
@Builder
public class CategoryResponse {
    private Long id;
    private String name;
    private List<Item> items;

    public static CategoryResponse from(Category category) {
        return CategoryResponse.builder().id(category.getId())
                .name(category.getName())
                .items(category.getItems())
                .build();
    }
}

/*



	Author : Rohit Chattopadhyay
	Path : src/main/java/com/assgn5/dto/CategoryResponse.java
	Repository : https://github.com/RohitChattopadhyay/Spring-Store



*/

