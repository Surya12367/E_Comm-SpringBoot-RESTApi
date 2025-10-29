package com.jsp.clickNBuy.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.clickNBuy.entity.User;
import com.jsp.clickNBuy.entity.UserOrder;

public interface UserOrderRepository extends JpaRepository<UserOrder, Long>{
	
	Optional<UserOrder> findByOrderId(String razorpay_order_id);

	List<UserOrder> findByUser(User user);

}
