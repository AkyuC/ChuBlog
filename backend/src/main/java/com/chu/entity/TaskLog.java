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
@TableName("t_task_log")
@ApiModel(value="TaskLog对象", description="")
public class TaskLog implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 任务日志id
    */
    @TableId
    @ApiModelProperty(value = "任务日志id")
    private Integer id;

    /**
    * 任务名称
    */
    @ApiModelProperty(value = "任务名称")
    private String taskName;

    /**
    * 任务组名
    */
    @ApiModelProperty(value = "任务组名")
    private String taskGroup;

    /**
    * 调用目标字符串
    */
    @ApiModelProperty(value = "调用目标字符串")
    private String invokeTarget;

    /**
    * 日志信息
    */
    @ApiModelProperty(value = "日志信息")
    private String taskMessage;

    /**
    * 执行状态 (0失败 1正常)
    */
    @ApiModelProperty(value = "执行状态 (0失败 1正常)")
    private Boolean status;

    /**
    * 错误信息
    */
    @ApiModelProperty(value = "错误信息")
    private String errorInfo;

    /**
    * 创建时间
    */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

}