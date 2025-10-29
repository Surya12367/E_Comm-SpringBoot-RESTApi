package com.jsp.clickNBuy.service;

import java.security.Principal;

import com.jsp.clickNBuy.dto.AddressDto;
import com.jsp.clickNBuy.dto.CartItemDto;
import com.jsp.clickNBuy.dto.ResponseDto;
import com.razorpay.RazorpayException;

public interface UserService {
	ResponseDto getAllApprovedProducts(int page, int size, String sort, boolean desc);

	ResponseDto addProductToCart(CartItemDto dto, Principal principal);

	ResponseDto removeFromCart(CartItemDto dto, Principal principal);

	ResponseDto viewCart(Principal principal);
	
	ResponseDto createOrder(AddressDto dto, Principal principal) throws RazorpayException;

	ResponseDto confirmOrder(String razorpay_order_id, String razorpay_payment_id);

	ResponseDto fetchAllOrders(Principal principal);
}
