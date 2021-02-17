package com.assgn5.service.implementation;

import com.assgn5.dao.OrderRepository;
import com.assgn5.dto.OrderRequest;
import com.assgn5.dto.OrderResponse;
import com.assgn5.model.Order;
import com.assgn5.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImplementation implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderResponse getById(long orderidentifier){
        Order order = orderRepository.getOne(orderidentifier);        
        return OrderResponse.from(order);
    }

    @Override
    public OrderResponse create(OrderRequest orderRequest){
        Order order = orderRequest.from();
        order =  orderRepository.save(order);
        return OrderResponse.from(order);
    }
}

/*

	Author : Rohit Chattopadhyay
	Path : src/main/java/com/assgn5/service/implementation/OrderServiceImplementation.java
	Repository : https://github.com/RohitChattopadhyay/Spring-Store



*/

