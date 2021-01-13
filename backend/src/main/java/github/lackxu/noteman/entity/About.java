package github.lackxu.noteman.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "about")
public class About {
    // PrimaryKey
    @TableId(value = "id", type = IdType.AUTO)
    private long id;
    private String context;
}
