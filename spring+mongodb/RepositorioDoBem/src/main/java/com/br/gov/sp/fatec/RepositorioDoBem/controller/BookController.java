package com.br.gov.sp.fatec.RepositorioDoBem.controller;

import com.br.gov.sp.fatec.RepositorioDoBem.domain.Book;
import com.br.gov.sp.fatec.RepositorioDoBem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/saveBook")
    public Book saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping("/getBook/{bookId}")
    public Book getBook(@PathVariable String bookId) {
        return  bookService.getBook(bookId);
    }

    @PutMapping("/updateBook/{bookId}")
    public Book updateBook(@RequestBody Book book, @PathVariable String bookId) {
        return bookService.updateBook(book, bookId);
    }

    @DeleteMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable String bookId) {
        bookService.deleteBook(bookId);
        return "Deleted Successfully";
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
}
