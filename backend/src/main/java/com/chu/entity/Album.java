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
@TableName("t_album")
@ApiModel(value="Album对象", description="")
public class Album implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 相册id
    */
    @TableId
    @ApiModelProperty(value = "相册id")
    private Integer id;

    /**
    * 相册名
    */
    @ApiModelProperty(value = "相册名")
    private String albumName;

    /**
    * 相册封面
    */
    @ApiModelProperty(value = "相册封面")
    private String albumCover;

    /**
    * 相册描述
    */
    @ApiModelProperty(value = "相册描述")
    private String albumDesc;

    /**
    * 状态 (1公开 2私密)
    */
    @ApiModelProperty(value = "状态 (1公开 2私密)")
    private Boolean status;

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