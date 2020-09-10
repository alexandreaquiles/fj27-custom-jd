package br.com.caelum.casadocodigoapi.model;

import	static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;

import br.com.caelum.casadocodigoapi.restclient.ProductDto;

class OrderItemTest {

	@Test
	void oItemPriceDeveraSerIgualAoProductPriceVezesAmount() {
		BigDecimal productPrice = BigDecimal.valueOf(25.50);
		BigDecimal expectedResult = BigDecimal.valueOf(102.00).setScale(2, RoundingMode.HALF_UP);
		
		ProductDto product = new ProductDto(1L, productPrice);
		Integer amount = 4;
		OrderItem actualResult = new OrderItem(product, amount);
		
		assertThat(actualResult.getItemPrice()).isEqualTo(expectedResult);
	}

}
