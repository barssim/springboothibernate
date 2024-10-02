package ma.solide.solide;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.solide.solide.entities.Book;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Book> list() {
		return bookRepository.findAll();
	}

//	public void saveNewBook()
//    {
//    Book myBook = new Book(4L, "Scharazad");
//    bookRepository.save(myBook);
//    }
}