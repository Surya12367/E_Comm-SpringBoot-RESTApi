package com.jsp.clickNBuy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.clickNBuy.entity.CartItem;
import com.jsp.clickNBuy.entity.Product;
import com.jsp.clickNBuy.entity.User;

public interface CartItemRepository extends JpaRepository<CartItem, Long>{

	CartItem findByUserAndProduct(User user, Product product);

	List<CartItem> findByUser(User user);

}
