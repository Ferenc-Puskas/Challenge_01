package letrasvivas.service;

import letrasvivas.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book createBook(Book book);
    Book getBookById(Long id);
    List<Book> searchBooksByTitle(String title);
    void deleteBook(Long id);
}
