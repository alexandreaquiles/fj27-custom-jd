package br.com.caelum.casadocodigoapi.restclient;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="administrativo", url="${administrativo.service.url}")
public interface ProductRepository {

	@GetMapping("/api/admin/products/{id}")
	public Optional<ProductDto> findById(@PathVariable("id") Long productId);

}
