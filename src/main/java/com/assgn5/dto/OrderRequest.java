package com.assgn5.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.assgn5.model.Item;
import com.assgn5.model.Order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class OrderRequest {
    Map<String, Integer> reqItems;
    
    public Order from() {
        List<Item> items = new ArrayList<>();
        
        for (Map.Entry<String, Integer> entry : reqItems.entrySet()) {
            log.debug(entry.toString());
           items.add(Item.builder().name(entry.getKey()).qty(entry.getValue()).build());
        }
        
		return Order.builder().items(items).build();
    }
}

/*



	Author : Rohit Chattopadhyay
	Path : src/main/java/com/assgn5/dto/OrderRequest.java
	Repository : https://github.com/RohitChattopadhyay/Spring-Store

*/

