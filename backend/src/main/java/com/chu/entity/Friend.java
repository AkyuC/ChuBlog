package com.chu.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Package: com.chu.entity
 * @Author chu
 * @CreateDate 2023-12-23
 * @describe 实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_friend")
@ApiModel(value="Friend对象", description="")
public class Friend implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 友链id
    */
    @TableId
    @ApiModelProperty(value = "友链id")
    private Integer id;

    /**
    * 友链名称
    */
    @ApiModelProperty(value = "友链名称")
    private String name;

    /**
    * 友链颜色
    */
    @ApiModelProperty(value = "友链颜色")
    private String color;

    /**
    * 友链头像
    */
    @ApiModelProperty(value = "友链头像")
    private String avatar;

    /**
    * 友链地址
    */
    @ApiModelProperty(value = "友链地址")
    private String url;

    /**
    * 友链介绍
    */
    @ApiModelProperty(value = "友链介绍")
    private String introduction;

    /**
    * 创建时间
    */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    /**
    * 更新时间
    */
    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

}