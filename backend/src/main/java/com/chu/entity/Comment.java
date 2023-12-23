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
@TableName("t_comment")
@ApiModel(value="Comment对象", description="")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 评论id
    */
    @TableId
    @ApiModelProperty(value = "评论id")
    private Integer id;

    /**
    * 类型 (1文章 2友链 3说说)
    */
    @ApiModelProperty(value = "类型 (1文章 2友链 3说说)")
    private Boolean commentType;

    /**
    * 类型id (类型为友链则没有值)
    */
    @ApiModelProperty(value = "类型id (类型为友链则没有值)")
    private Integer typeId;

    /**
    * 父评论id
    */
    @ApiModelProperty(value = "父评论id")
    private Integer parentId;

    /**
    * 回复评论id
    */
    @ApiModelProperty(value = "回复评论id")
    private Integer replyId;

    /**
    * 评论内容
    */
    @ApiModelProperty(value = "评论内容")
    private String commentContent;

    /**
    * 评论用户id
    */
    @ApiModelProperty(value = "评论用户id")
    private Integer fromUid;

    /**
    * 回复用户id
    */
    @ApiModelProperty(value = "回复用户id")
    private Integer toUid;

    /**
    * 是否通过 (0否 1是)
    */
    @ApiModelProperty(value = "是否通过 (0否 1是)")
    private Boolean isCheck;

    /**
    * 评论时间
    */
    @ApiModelProperty(value = "评论时间")
    private LocalDateTime createTime;

    /**
    * 更新时间
    */
    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

}