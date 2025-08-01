package letrasvivas.service;

import letrasvivas.exception.ResourceNotFoundException;
import letrasvivas.model.Book;
import letrasvivas.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository repository;

    @Autowired
    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    @Override
    public Book createBook(Book book) {
        return repository.save(book);
    }

    @Override
    public Book getBookById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with id: " + id));
    }

    @Override
    public List<Book> searchBooksByTitle(String title) {
        return repository.findByTitleContainingIgnoreCase(title);
    }

    @Override
    public void deleteBook(Long id) {
        Book book = getBookById(id);
        repository.delete(book);
    }
}
