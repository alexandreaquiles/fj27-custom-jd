package br.com.caelum.casadocodigoapi.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.caelum.casadocodigoapi.restclient.ProductDto;

@Entity
public class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private CheckoutOrder order;
	
	private Long productId;
	private Integer amount;
	private BigDecimal itemPrice = BigDecimal.ZERO;
	
    /**
     * @deprecated hibernate only
     */
    public OrderItem() {
	}

	public OrderItem(ProductDto product, Integer amount) {
		this.productId = product.getId();
		this.amount = amount;
		this.itemPrice = product.getPrice().multiply(BigDecimal.valueOf(amount))
				.setScale(2, RoundingMode.HALF_UP);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public BigDecimal getItemPrice() {
		return itemPrice.setScale(2, RoundingMode.HALF_UP);
	}

	public void setItemPrice(BigDecimal itemPrice) {
		this.itemPrice = itemPrice;
	}

	public CheckoutOrder getOrder() {
		return order;
	}

	public void setOrder(CheckoutOrder order) {
		this.order = order;
	}
}
