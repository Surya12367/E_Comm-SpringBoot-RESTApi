package com.jsp.clickNBuy.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OutOfStockException extends RuntimeException{
	
	String message = "Out Of Stock";

}
