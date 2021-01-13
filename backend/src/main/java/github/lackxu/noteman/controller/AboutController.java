package github.lackxu.noteman.controller;

//import github.lackxu.noteman.entity.About;
//import github.lackxu.noteman.mapper.AboutMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class AboutController {

//    @Autowired
//    private AboutMapper aboutMapper;

    // REST Api Server Path (Where To Store/Transfer Data)
    @RequestMapping("/about")
    public String about() {
        return "HELLO";
    }
}
