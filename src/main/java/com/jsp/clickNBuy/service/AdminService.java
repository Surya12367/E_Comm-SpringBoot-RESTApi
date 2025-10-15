package com.jsp.clickNBuy.service;

import com.jsp.clickNBuy.dto.ResponseDto;
import com.jsp.clickNBuy.entity.Category;

public interface AdminService {

	ResponseDto addCategory(Category category);

	ResponseDto viewCategories();

	ResponseDto deleteCategory(Long id);

	ResponseDto updateCategory(Long id, Category category);

}
