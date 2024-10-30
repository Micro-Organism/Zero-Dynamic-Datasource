package com.zero.dynamic.datasource.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;


@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("system_user")
public class SystemUserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id")
    private String userId;

    @TableField("username")
    private String username;

    @TableField("age")
    private Integer age;

    @TableField("gender")
    private Boolean gender;

    @TableField("remark")
    private String remark;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("create_id")
    private String createId;

    @TableField("update_time")
    private LocalDateTime updateTime;

    @TableField("update_id")
    private String updateId;

    @TableField("enabled")
    private Boolean enabled;

}
