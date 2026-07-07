package com.tnsif.shoppingmallmanagementprogram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.shoppingmallmanagementprogram.entity.Item;
import com.tnsif.shoppingmallmanagementprogram.service.ItemService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Itemcontroller {
	@Autowired
	private ItemService is;
	
	
	@PostMapping("/register")
	public String registerItem(@RequestBody Item item) {
	    return is.registeritem(item);
	}

	@GetMapping("/items")
	public List<Item> getItems() {
	    return is.getItems();
	}

	@DeleteMapping("/delete/{id}")
	public String deleteItem(@PathVariable Integer id) {
	    return is.deleteItem(id);
	}

	@PutMapping("/update/{id}")
	public String updateItem(@PathVariable Integer id, @RequestBody Item item) {
	    return is.updateItem(id, item);
	}
	

}
