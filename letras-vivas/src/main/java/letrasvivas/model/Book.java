package letrasvivas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Author is required")
    private String author;

    @Min(value = 1400, message = "Publication year must be realistic")
    @Max(value = 2100, message = "Publication year must be realistic")
    private int publicationYear;

    // Constructors, getters and setters
    public Book() {}

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public Long getId() { return id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public int getPublicationYear() { return publicationYear; }

    public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }
}
