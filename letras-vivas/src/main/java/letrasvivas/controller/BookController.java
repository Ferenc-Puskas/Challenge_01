package letrasvivas.controller;

import letrasvivas.model.Book;
import letrasvivas.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService service;

    @Autowired
    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    @PostMapping
    public Book addBook(@Valid @RequestBody Book book) {
        return service.createBook(book);
    }

    @GetMapping("/search")
    public List<Book> searchByTitle(@RequestParam String title) {
        return service.searchBooksByTitle(title);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        service.deleteBook(id);
    }
}
