package github.lackxu.noteman.controller;

import github.lackxu.noteman.entity.User;
import github.lackxu.noteman.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api")
@MapperScan("github.lackxu.noteman.mapper")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/helloUser")
    public String helloUser() {
        return "HELLO USER";
    }

    @RequestMapping("/getUser")
    public User selectUser(User user) {
        return userMapper.selectById(user);
    }

    @RequestMapping("/getUserList")
    public List<User> selectUserList() {
        return userMapper.selectList(null);
    }

    @DeleteMapping("/delUser")
    public int delUser(User user) {
        return userMapper.deleteById(user);
    }
}
