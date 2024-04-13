package com.br.gov.sp.fatec.RepositorioDoBem.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document
public class Book {

    @Id
    private String bookId;
    private String bookName;
    private String authorName;

    public Book(String bookId, String bookName, String authorName)
    {
        super();
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName=authorName;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
