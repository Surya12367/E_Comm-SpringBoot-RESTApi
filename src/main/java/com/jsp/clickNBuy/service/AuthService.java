package com.jsp.clickNBuy.service;

import java.util.concurrent.TimeoutException;

import com.jsp.clickNBuy.dto.LoginDto;
import com.jsp.clickNBuy.dto.OtpDto;
import com.jsp.clickNBuy.dto.PasswordDto;
import com.jsp.clickNBuy.dto.ResponseDto;
import com.jsp.clickNBuy.dto.UserDto;


public interface AuthService {

	ResponseDto register(UserDto userDto);
	
	ResponseDto verifyOtp(OtpDto otpDto) throws TimeoutException;

	ResponseDto resendOtp(String email);

	ResponseDto forgotPassword(String email);

	ResponseDto forgotPassword(PasswordDto passwordDto) throws TimeoutException;

	ResponseDto login(LoginDto loginDto);
}
