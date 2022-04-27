package me.zhengjie.modules.system.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import me.zhengjie.base.CommonEntity;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@TableName(value = "template")
public class Template extends CommonEntity<Template> implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "奖学金ID")
    @TableId(type= IdType.ASSIGN_ID)
    private String id;

    @ApiModelProperty(value = "奖学金名称")
    private String name;

}
