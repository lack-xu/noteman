package github.lackxu.noteman.controller;

import github.lackxu.noteman.mapper.TodoListMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
// IMPORTANT!!!
@RequestMapping("/api")
// IMPORTANT!!!
@MapperScan("github.lackxu.noteman.mapper")
public class TodoListController {
    @Autowired
    private TodoListMapper todoListMapper;
}
