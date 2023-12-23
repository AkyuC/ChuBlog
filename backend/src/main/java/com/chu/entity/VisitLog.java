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
@TableName("t_visit_log")
@ApiModel(value="VisitLog对象", description="")
public class VisitLog implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * id
    */
    @TableId
    @ApiModelProperty(value = "id")
    private Integer id;

    /**
    * 访问页面
    */
    @ApiModelProperty(value = "访问页面")
    private String page;

    /**
    * 访问ip
    */
    @ApiModelProperty(value = "访问ip")
    private String ipAddress;

    /**
    * 访问地址
    */
    @ApiModelProperty(value = "访问地址")
    private String ipSource;

    /**
    * 操作系统
    */
    @ApiModelProperty(value = "操作系统")
    private String os;

    /**
    * 浏览器
    */
    @ApiModelProperty(value = "浏览器")
    private String browser;

    /**
    * 访问时间
    */
    @ApiModelProperty(value = "访问时间")
    private LocalDateTime createTime;

}