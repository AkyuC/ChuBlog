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
@TableName("t_exception_log")
@ApiModel(value="ExceptionLog对象", description="")
public class ExceptionLog implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 异常id
    */
    @TableId
    @ApiModelProperty(value = "异常id")
    private Integer id;

    /**
    * 异常模块
    */
    @ApiModelProperty(value = "异常模块")
    private String module;

    /**
    * 异常uri
    */
    @ApiModelProperty(value = "异常uri")
    private String uri;

    /**
    * 异常名称
    */
    @ApiModelProperty(value = "异常名称")
    private String name;

    /**
    * 操作描述
    */
    @ApiModelProperty(value = "操作描述")
    private String description;

    /**
    * 异常方法
    */
    @ApiModelProperty(value = "异常方法")
    private String errorMethod;

    /**
    * 异常信息
    */
    @ApiModelProperty(value = "异常信息")
    private String message;

    /**
    * 请求参数
    */
    @ApiModelProperty(value = "请求参数")
    private String params;

    /**
    * 请求方式
    */
    @ApiModelProperty(value = "请求方式")
    private String requestMethod;

    /**
    * 操作ip
    */
    @ApiModelProperty(value = "操作ip")
    private String ipAddress;

    /**
    * 操作地址
    */
    @ApiModelProperty(value = "操作地址")
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
    * 操作时间
    */
    @ApiModelProperty(value = "操作时间")
    private LocalDateTime createTime;

}