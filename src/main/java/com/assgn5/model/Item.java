package com.assgn5.model;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private String name;
    private int qty;
}

/*

	Author : Rohit Chattopadhyay
	Path : src/main/java/com/assgn5/model/Item.java
	Repository : https://github.com/RohitChattopadhyay/Spring-Store

*/

