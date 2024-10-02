package ma.solide.solide;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.solide.solide.entities.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}