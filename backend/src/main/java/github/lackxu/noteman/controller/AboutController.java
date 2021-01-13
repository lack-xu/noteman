package github.lackxu.noteman.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import github.lackxu.noteman.entity.About;
import github.lackxu.noteman.mapper.AboutMapper;
import org.json.JSONObject;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
// IMPORTANT!!!
@RequestMapping("/api")
// IMPORTANT!!!
@MapperScan("github.lackxu.noteman.mapper")
public class AboutController {

    @Autowired
    private AboutMapper aboutMapper;

    private About about;

    // REST Api Server Path (Where To Store/Transfer Data)
    @RequestMapping("/aboutList")
    public List<About> selectAboutList() {
        return aboutMapper.selectList(null);
    }

    @GetMapping("/aboutType")
    public About selectAboutById(Integer id) {
        return aboutMapper.selectById(id = 2);
    }
}
