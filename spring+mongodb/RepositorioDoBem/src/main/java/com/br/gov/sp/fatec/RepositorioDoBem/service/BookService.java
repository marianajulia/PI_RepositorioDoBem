package com.br.gov.sp.fatec.RepositorioDoBem.service;

import com.br.gov.sp.fatec.RepositorioDoBem.domain.Book;
import com.br.gov.sp.fatec.RepositorioDoBem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBook(String bookId) {
        return bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found with id: " + bookId));
    }


    public Book updateBook(Book book, String bookId) {
        book.setBookId(bookId);
        return bookRepository.save(book);
    }

    public void deleteBook(String bookId) {
        bookRepository.deleteById(bookId);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
