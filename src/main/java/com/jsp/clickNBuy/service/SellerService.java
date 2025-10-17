package com.jsp.clickNBuy.service;

import java.security.Principal;

import com.jsp.clickNBuy.dto.ProductDto;
import com.jsp.clickNBuy.dto.ResponseDto;
import com.jsp.clickNBuy.entity.Product;

public interface SellerService {
	ResponseDto saveProduct(ProductDto dto, Principal principal);

	ResponseDto deleteProduct(Long id, Principal principal);

	ResponseDto getProducts(Principal principal, int page, int size, String sortBy, boolean desc);

	ResponseDto addProducts(Principal principal);

	ResponseDto updateProduct(Long id, Product product, Principal principal);
}
