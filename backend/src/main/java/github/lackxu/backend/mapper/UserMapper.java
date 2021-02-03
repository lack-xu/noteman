package github.lackxu.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import github.lackxu.backend.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
