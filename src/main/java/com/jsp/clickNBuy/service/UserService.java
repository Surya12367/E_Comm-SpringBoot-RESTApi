package com.jsp.clickNBuy.service;

import java.security.Principal;

import com.jsp.clickNBuy.dto.AddProductDto;
import com.jsp.clickNBuy.dto.ResponseDto;

public interface UserService {
	ResponseDto getAllApprovedProducts(int page, int size, String sort, boolean desc);

	ResponseDto addProductToCart(AddProductDto dto, Principal principal);
}
