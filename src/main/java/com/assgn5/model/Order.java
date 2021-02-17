package com.assgn5.model;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer_order")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @ElementCollection
    private List<Item> items;
}

/*

	Author : Rohit Chattopadhyay
	Path : src/main/java/com/assgn5/model/Order.java
	Repository : https://github.com/RohitChattopadhyay/Spring-Store

*/

