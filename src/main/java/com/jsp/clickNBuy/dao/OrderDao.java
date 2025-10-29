package com.jsp.clickNBuy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jsp.clickNBuy.entity.User;
import com.jsp.clickNBuy.entity.UserOrder;
import com.jsp.clickNBuy.exception.DataNotFoundException;
import com.jsp.clickNBuy.repository.UserOrderRepository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class OrderDao {
	
	UserOrderRepository orderRepository;

	public void save(UserOrder userOrder) {
		orderRepository.save(userOrder);
	}

	public UserOrder findByOrderId(String razorpay_order_id) {
		return orderRepository.findByOrderId(razorpay_order_id)
				.orElseThrow(() -> new DataNotFoundException("No Order Found"));
	}

	public List<UserOrder> fetchAllOrders(User user) {
		List<UserOrder> orders = orderRepository.findByUser(user);
		if (orders.isEmpty())
			throw new DataNotFoundException("No Orders Found");
		return orders;
	}

}
