package com.jsp.clickNBuy.service;

import java.security.Principal;

import com.jsp.clickNBuy.dto.ProductDto;
import com.jsp.clickNBuy.dto.ResponseDto;

public interface SellerService {
	ResponseDto saveProduct(ProductDto dto, Principal principal);

	ResponseDto getProducts(Principal principal);

	ResponseDto deleteProduct(Long id, Principal principal);
}
