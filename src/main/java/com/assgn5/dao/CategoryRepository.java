package com.assgn5.dao;

import com.assgn5.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {}
/*
	Author : Rohit Chattopadhyay
	Path : src/main/java/com/assgn5/dao/CategoryRepository.java
	Repository : https://github.com/RohitChattopadhyay/Spring-Store


*/

