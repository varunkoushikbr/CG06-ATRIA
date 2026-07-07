package com.tnsif.shoppingmallmanagementprogram.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.shoppingmallmanagementprogram.entity.Item;
import com.tnsif.shoppingmallmanagementprogram.repository.ItemRepo;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepo ir;
	
	
	public String registeritem(Item i) {
		ir.save(i);
		return "Item registered successfully.";
	}
	
	public List<Item> getItems(){
		return (List<Item>) ir.findAll();
	}

	public String deleteItem(Integer id) {
        if (ir.existsById(id)) {
            ir.deleteById(id);
            return "Item deleted successfully.";
        }
        return "Item not found.";
    }
	public String updateItem(Integer id, Item item) {
        Item existingItem = ir.findById(id).orElse(null);

        if (existingItem != null) {
            existingItem.setName(item.getName());
            existingItem.setPrice(item.getPrice());
            ir.save(existingItem);
            return "Item updated successfully.";
        }

        return "Item not found.";
    }
}
