package br.com.caelum.casadocodigoapi.restclient;

import java.util.Optional;

import org.springframework.stereotype.Component;

@Component
public class ProductRepository {

	//TODO chamar o serviço administrativo
	public Optional<ProductDto> findById(Long productId) {
		return Optional.empty();
	}

}
