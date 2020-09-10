package br.com.caelum.casadocodigoapi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;

import br.com.caelum.casadocodigoapi.model.Author;

public interface AuthorRepository extends Repository<Author, Long> {

	List<Author> findAll();

	Optional<Author> findById(Long id);

	Author save(Author author);
}
