package com.br.gov.sp.fatec.RepositorioDoBem.repository;

import com.br.gov.sp.fatec.RepositorioDoBem.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
