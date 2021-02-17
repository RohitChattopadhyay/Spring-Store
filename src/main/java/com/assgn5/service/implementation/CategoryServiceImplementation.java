package com.assgn5.service.implementation;

import com.assgn5.dao.CategoryRepository;
import com.assgn5.dto.CategoryResponse;
import com.assgn5.model.Category;
import com.assgn5.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service    
public class CategoryServiceImplementation implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    
    @Override
    public CategoryResponse getById(long categoryId){
        Category category = categoryRepository.getOne(categoryId);        
        return CategoryResponse.from(category);
    }
}

/*

	Author : Rohit Chattopadhyay
	Path : src/main/java/com/assgn5/service/implementation/CategoryServiceImplementation.java
	Repository : https://github.com/RohitChattopadhyay/Spring-Store


*/

