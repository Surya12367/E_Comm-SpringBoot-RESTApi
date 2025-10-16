package com.jsp.clickNBuy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jsp.clickNBuy.entity.Category;
import com.jsp.clickNBuy.entity.Product;
import com.jsp.clickNBuy.entity.User;
import com.jsp.clickNBuy.exception.DataNotFoundException;
import com.jsp.clickNBuy.repository.CategoryRepository;
import com.jsp.clickNBuy.repository.ProductRepository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class SellerDao {
	ProductRepository productRepository;
	CategoryRepository categoryRepository;

	public void saveProduct(Product product) {
		productRepository.save(product);
	}

	public Category getCategory(String category) {
		return categoryRepository.findByName(category);
	}

	public boolean isCategoryPresent(String category) {
		return categoryRepository.existsByName(category);
	}

	public boolean isProductUnique(String name, String brand, Double price) {
		return !productRepository.existsByNameAndBrandAndPrice(name, brand, price);
	}

	public List<Product> fetchProducts(User user) {
		List<Product> products = productRepository.findByUser(user);
		if (products.isEmpty())
			throw new DataNotFoundException("No Products Present");
		else
			return products;
	}

	public Product findProductById(Long id) {
		return productRepository.findById(id).orElseThrow(()->new DataNotFoundException("Product Not Found with Id: "+id));
	}

	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}
}
