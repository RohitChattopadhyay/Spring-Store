package com.assgn5;

import com.assgn5.dto.CategoryResponse;
import com.assgn5.dto.OrderRequest;
import com.assgn5.dto.OrderResponse;
import com.assgn5.service.CategoryService;
import com.assgn5.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private OrderService orderService;

    @GetMapping("/category/{id}")
    private CategoryResponse getCategoryById(@NonNull @PathVariable(value = "id") Long id) {
        try {
            return categoryService.getById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/order/{id}")
    private OrderResponse getOrderById(@NonNull @PathVariable(value = "id") Long id) {
        try {
            return orderService.getById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @PostMapping("/order")
    private OrderResponse createOrder(@Validated @RequestBody OrderRequest request) {
        return orderService.create(request);
    }
    
}
