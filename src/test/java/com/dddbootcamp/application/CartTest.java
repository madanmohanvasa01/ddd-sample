package com.dddbootcamp.application;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.dddbootcamp.domain.Cart;
import com.dddbootcamp.domain.Product;

public class CartTest {
	@Test
	void shouldAddProductToCart() {
		Cart cart = new Cart();
		Product product = new Product("Some test product");
		cart.add(product);

		List<Product> actual = cart.getProducts();

		assertEquals(1, actual.size());
		assertEquals("Some test product", actual.get(0).getName());

	}
}
