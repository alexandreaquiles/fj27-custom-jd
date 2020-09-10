package br.com.caelum.casadocodigoapi.restclient;

import java.math.BigDecimal;

public class ProductDto {

	private Long id;
	private BigDecimal price;

	public ProductDto() {
	}
	
	public ProductDto(Long id, BigDecimal price) {
		this.id = id;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}


}
