package com.assgn5.model;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(length=10, nullable=false, unique=false)
    private String name;

    @ElementCollection
    private List<Item> items;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
