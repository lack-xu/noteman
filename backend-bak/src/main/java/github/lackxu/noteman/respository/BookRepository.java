package github.lackxu.noteman.respository;

import github.lackxu.noteman.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
