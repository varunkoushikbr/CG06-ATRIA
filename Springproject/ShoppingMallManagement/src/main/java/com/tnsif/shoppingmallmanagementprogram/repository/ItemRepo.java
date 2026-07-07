package com.tnsif.shoppingmallmanagementprogram.repository;

import org.springframework.data.repository.CrudRepository;

import com.tnsif.shoppingmallmanagementprogram.entity.Item;

public interface ItemRepo extends CrudRepository<Item, Integer>{

}
