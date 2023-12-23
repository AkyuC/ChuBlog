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
@TableName("t_photo")
@ApiModel(value="Photo对象", description="")
public class Photo implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 照片id
    */
    @TableId
    @ApiModelProperty(value = "照片id")
    private Integer id;

    /**
    * 相册id
    */
    @ApiModelProperty(value = "相册id")
    private Integer albumId;

    /**
    * 照片名
    */
    @ApiModelProperty(value = "照片名")
    private String photoName;

    /**
    * 照片描述
    */
    @ApiModelProperty(value = "照片描述")
    private String photoDesc;

    /**
    * 照片链接
    */
    @ApiModelProperty(value = "照片链接")
    private String photoUrl;

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