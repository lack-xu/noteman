package github.lackxu.backend.controller;

//import github.lackxu.noteman.mapper.NoteMapper;
//import org.springframework.beans.factory.annotation.Autowired;
import github.lackxu.backend.entity.Note;
import github.lackxu.backend.mapper.NoteMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api")
@MapperScan("github.lackxu.noteman.mapper")
public class NoteController {
    @Autowired
    private NoteMapper noteMapper;

    @RequestMapping("/getNote")
    public Note getUser(Note note) {
        return noteMapper.selectById(note);
    }

    @RequestMapping("/getNoteList")
    public List<Note> getNoteList() {
        return noteMapper.selectList(null);
    }

    @DeleteMapping("/delNote")
    public int delNote(Note note) {
        return noteMapper.deleteById(note);
    }

    @PatchMapping("/newNote")
    public int newNote(Note note) {
        return noteMapper.insert(note);
    }
}
