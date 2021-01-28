package github.lackxu.noteman.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import github.lackxu.noteman.entity.About;
import github.lackxu.noteman.mapper.AboutMapper;
import org.json.JSONObject;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping("/getAbout")
    public List<About> getAboutList() {
        return aboutMapper.selectList(null);
    }

    @PostMapping("/getAbout?id={id}")
    public About getAboutById(@RequestBody Integer id) {
        return aboutMapper.selectById(id);
    }

    @DeleteMapping("/getAbout?id={id}")
    public void deleteAbout(@PathVariable Integer id) {
        aboutMapper.deleteById(id);
    }

    @PostMapping("/newAbout")
    public void addAboutContext(About about) {
        aboutMapper.insert(about);
    }

    @RequestMapping("/updateAbout")
    public void updateAboutContext(About about) {
        aboutMapper.updateById(about);
    }
}
