package github.lackxu.noteman.controller;

import github.lackxu.noteman.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserMapper userMapper;
}
