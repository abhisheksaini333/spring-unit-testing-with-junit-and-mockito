package com.edureka.unittesting.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edureka.unittesting.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
