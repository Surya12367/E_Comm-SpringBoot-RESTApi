package com.jsp.clickNBuy.service;

import java.security.Principal;

import com.jsp.clickNBuy.dto.CartItemDto;
import com.jsp.clickNBuy.dto.ResponseDto;

public interface UserService {
	ResponseDto getAllApprovedProducts(int page, int size, String sort, boolean desc);

	ResponseDto addProductToCart(CartItemDto dto, Principal principal);

	ResponseDto removeFromCart(CartItemDto dto, Principal principal);

	ResponseDto viewCart(Principal principal);
}
