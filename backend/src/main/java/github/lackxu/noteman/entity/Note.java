package github.lackxu.noteman.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "note")
public class Note {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    private int user_id;
    private String title;
    private String description;
    private String context;
    private Date created;
}
