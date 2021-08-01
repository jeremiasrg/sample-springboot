package br.com.jr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jr.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
