package github.lackxu.noteman.controller;

import com.baomidou.mybatisplus.core.assist.ISqlRunner;
import github.lackxu.noteman.entity.User;
import github.lackxu.noteman.mapper.BookMapper;
import github.lackxu.noteman.mapper.UserMapper;
import github.lackxu.noteman.result.Result;
import github.lackxu.noteman.result.ResultFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.List;
import java.util.Objects;

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

    @GetMapping("/getUser")
    public User selectUser() {
        return userMapper.selectById(1);
    }

    @GetMapping("/getUserList")
    public List<User> selectUserList() {
        return userMapper.selectList(null);
    }

    @DeleteMapping("/delUser")
    public int delUser(User user) {
        return userMapper.deleteById(user);
    }

    @PostMapping("/login")
    public Result login(@RequestBody User requestUser) {
        String username = HtmlUtils.htmlEscape(requestUser.getUsername());
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, requestUser.getPassword());
        usernamePasswordToken.setRememberMe(true);
        try {
            subject.login(usernamePasswordToken);
            List<User> userList = userMapper.selectList(null);
            User user = userList.get(1);
            return ResultFactory.buildSuccessResult(user);
        } catch (IncorrectCredentialsException e) {
            return ResultFactory.buildFailResult("密码错误");
        } catch (UnknownAccountException e) {
            return ResultFactory.buildFailResult("账号不存在");
        }
    }

    @GetMapping("/logout")
    public Result logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return ResultFactory.buildSuccessResult("成功登出");
    }

    @GetMapping("/authentication")
    public String authentication() {
        return "身份认证成功";
    }

    @Autowired
    BookMapper bookMapper;

    @RequestMapping("/getAll")
    public String getAll() {
        String all = userMapper.selectList(null).toString();
        all = all + bookMapper.selectList(null).toString();
        return all;
    }
}
