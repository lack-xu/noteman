package github.lackxu.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import github.lackxu.backend.entity.Note;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteMapper extends BaseMapper<Note> {
}
