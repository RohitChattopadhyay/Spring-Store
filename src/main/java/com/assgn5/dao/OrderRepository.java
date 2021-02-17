package com.assgn5.dao;

import com.assgn5.model.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {}
/*


	Author : Rohit Chattopadhyay
	Path : src/main/java/com/assgn5/dao/OrderRepository.java
	Repository : https://github.com/RohitChattopadhyay/Spring-Store

*/

