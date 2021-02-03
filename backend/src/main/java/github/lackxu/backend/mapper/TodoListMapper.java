package github.lackxu.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import github.lackxu.backend.entity.Todo;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListMapper extends BaseMapper<Todo> {
}
