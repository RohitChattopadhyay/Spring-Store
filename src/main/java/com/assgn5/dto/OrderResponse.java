package com.assgn5.dto;

import lombok.Data;

import java.util.List;

import com.assgn5.model.Order;
import com.assgn5.model.Item;

import lombok.Builder;

@Data
@Builder
public class OrderResponse {
    private Long id;
    private List<Item> items;

    public static OrderResponse from(Order order) {
        return OrderResponse.builder().id(order.getId())
                .items(order.getItems())
                .build();
    }
}

/*
	Author : Rohit Chattopadhyay
	Path : src/main/java/com/assgn5/dto/OrderResponse.java
	Repository : https://github.com/RohitChattopadhyay/Spring-Store

*/

