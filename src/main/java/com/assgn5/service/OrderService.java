package com.assgn5.service;

import com.assgn5.dto.OrderResponse;
import com.assgn5.dto.OrderRequest;

public interface OrderService {
    OrderResponse getById(long orderidentifier);
    OrderResponse create(OrderRequest orderRequest);
}
