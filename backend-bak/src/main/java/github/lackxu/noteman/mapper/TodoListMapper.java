package github.lackxu.noteman.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import github.lackxu.noteman.entity.Todo;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListMapper extends BaseMapper<Todo> {
}
