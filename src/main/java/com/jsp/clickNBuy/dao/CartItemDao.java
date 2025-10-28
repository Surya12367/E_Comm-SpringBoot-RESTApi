package com.jsp.clickNBuy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jsp.clickNBuy.entity.CartItem;
import com.jsp.clickNBuy.entity.Product;
import com.jsp.clickNBuy.entity.User;
import com.jsp.clickNBuy.exception.DataNotFoundException;
import com.jsp.clickNBuy.repository.CartItemRepository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class CartItemDao {
	
	CartItemRepository itemRepository;
	
	public void save(CartItem item) {
		itemRepository.save(item);
	}

	public CartItem getIfExists(User user, Product product) {
		return itemRepository.findByUserAndProduct(user, product);
	}

	public void deleteById(Long id) {
		itemRepository.deleteById(id);
	}

	public List<CartItem> getCartItems(User user) {
		List<CartItem> items = itemRepository.findByUser(user);
		if (items.isEmpty())
			throw new DataNotFoundException("No Items in Cart");
		else
			return items;
	}

}
