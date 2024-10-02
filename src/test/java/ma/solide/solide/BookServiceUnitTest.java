package ma.solide.solide;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import ma.solide.solide.entities.Book;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class BookServiceUnitTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testSaveBook() {
        // Create a new Book entity
    	Book myBook = new Book(4L, "Scharazad");

        // Save the entity using the repository
        Book savedBook = bookRepository.save(myBook);

        // Verify that the savedBook is not null and has an ID assigned
        assertNotNull(savedBook.getId());
        // Verify that the savedBook has the correct title and author
        assertEquals("Scharazad", savedBook.getName());
    }
}
