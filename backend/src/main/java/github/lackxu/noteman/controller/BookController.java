package github.lackxu.noteman.controller;

import github.lackxu.noteman.entity.Book;
import github.lackxu.noteman.mapper.BookMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api")
// IMPORTANT!!!
@MapperScan("github.lackxu.noteman.mapper")
public class BookController {
    @Autowired
    private BookMapper bookMapper;

    @RequestMapping("/getBook")
    public Book getUser(Book book) {
        return bookMapper.selectById(book);
    }

    @RequestMapping("/getBookList")
    public List<Book> getNoteList() {
        return bookMapper.selectList(null);
    }

    @DeleteMapping("/delNote")
    public int delNote(Book book) {
        return bookMapper.deleteById(book);
    }

    @PatchMapping("/newNote")
    public int newNote(Book book) {
        return bookMapper.insert(book);
    }
}
