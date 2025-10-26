package com.jsp.clickNBuy.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jsp.clickNBuy.dto.AddProductDto;
import com.jsp.clickNBuy.dto.ResponseDto;
import com.jsp.clickNBuy.service.UserService;

import io.swagger.v3.oas.annotations.Operation;

public class UserController {
	UserService userService;

	@PostMapping("/cart/add")
	@Operation(summary = "Add to Cart")
	public ResponseDto addProductToCart(@RequestBody AddProductDto dto, Principal principal) {
		return userService.addProductToCart(dto,principal);
	}}
