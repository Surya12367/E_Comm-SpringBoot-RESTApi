package com.jsp.clickNBuy.service;

import java.util.concurrent.TimeoutException;

import com.jsp.clickNBuy.dto.OtpDto;
import com.jsp.clickNBuy.dto.ResponseDto;
import com.jsp.clickNBuy.dto.UserDto;


public interface AuthService {

	ResponseDto register(UserDto userDto);
	
	ResponseDto verifyOtp(OtpDto otpDto) throws TimeoutException;

}
