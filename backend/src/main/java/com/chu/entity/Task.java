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
@TableName("t_task")
@ApiModel(value="Task对象", description="")
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 任务id
    */
    @TableId
    @ApiModelProperty(value = "任务id")
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
    * 调用目标
    */
    @ApiModelProperty(value = "调用目标")
    private String invokeTarget;

    /**
    * cron执行表达式
    */
    @ApiModelProperty(value = "cron执行表达式")
    private String cronExpression;

    /**
    * 计划执行错误策略 (1立即执行 2执行一次 3放弃执行)
    */
    @ApiModelProperty(value = "计划执行错误策略 (1立即执行 2执行一次 3放弃执行)")
    private Boolean misfirePolicy;

    /**
    * 是否并发执行 (0否 1是)
    */
    @ApiModelProperty(value = "是否并发执行 (0否 1是)")
    private Boolean concurrent;

    /**
    * 任务状态 (0运行 1暂停)
    */
    @ApiModelProperty(value = "任务状态 (0运行 1暂停)")
    private Boolean status;

    /**
    * 任务备注信息
    */
    @ApiModelProperty(value = "任务备注信息")
    private String remark;

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