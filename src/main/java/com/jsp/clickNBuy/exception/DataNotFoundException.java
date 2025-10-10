package com.jsp.clickNBuy.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DataNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1807993446297818015L;
	String message = "Data Not Found";
}
