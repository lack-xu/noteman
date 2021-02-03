package github.lackxu.backend.controller;

import github.lackxu.backend.entity.Book;
import github.lackxu.backend.mapper.BookMapper;
import github.lackxu.backend.respository.BookRepository;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api")
// IMPORTANT!!!
@MapperScan("github.lackxu.noteman.mapper")
public class BookController {
    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/getBook")
    public Book getUser(Book book) {
        return bookMapper.selectById(book);
    }

    @RequestMapping("/getBookList")
    public List<Book> getNoteList() {
        return bookMapper.selectList(null);
    }

    @GetMapping("/findAll/{page}/{size}")
    public Page<Book> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        PageRequest request = PageRequest.of(page, size);
        return bookRepository.findAll(request);
    }

    @PostMapping("/saveBook")
    public String save(@RequestBody Book book) {
        Book result = bookRepository.save(book);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    @GetMapping("/findById/{id}")
    public Book findById(@PathVariable("id") Integer id) {
        return bookRepository.findById(id).get();
    }

    @PutMapping("/update")
    public String update(@RequestBody Book book) {
        Book result = bookRepository.save(book);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        bookRepository.deleteById(id);
    }

    @DeleteMapping("/delBook")
    public int delNote(Book book) {
        return bookMapper.deleteById(book);
    }

    @PatchMapping("/newBook")
    public int newNote(Book book) {
        return bookMapper.insert(book);
    }
}
