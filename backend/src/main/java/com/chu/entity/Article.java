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
@TableName("t_article")
@ApiModel(value="Article对象", description="")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 文章id
    */
    @TableId
    @ApiModelProperty(value = "文章id")
    private Integer id;

    /**
    * 分类id
    */
    @ApiModelProperty(value = "分类id")
    private Integer categoryId;

    /**
    * 缩略图
    */
    @ApiModelProperty(value = "缩略图")
    private String articleCover;

    /**
    * 文章标题
    */
    @ApiModelProperty(value = "文章标题")
    private String articleTitle;

    /**
    * 文章内容
    */
    @ApiModelProperty(value = "文章内容")
    private String articleContent;

    /**
    * 类型 (1原创 2转载 3翻译)
    */
    @ApiModelProperty(value = "类型 (1原创 2转载 3翻译)")
    private Boolean articleType;

    /**
    * 是否置顶 (0否 1是）
    */
    @ApiModelProperty(value = "是否置顶 (0否 1是）")
    private Boolean isTop;

    /**
    * 是否删除 (0否 1是)
    */
    @ApiModelProperty(value = "是否删除 (0否 1是)")
    private Boolean isDelete;

    /**
    * 是否推荐 (0否 1是)
    */
    @ApiModelProperty(value = "是否推荐 (0否 1是)")
    private Boolean isRecommend;

    /**
    * 状态 (1公开 2私密 3评论可见)
    */
    @ApiModelProperty(value = "状态 (1公开 2私密 3评论可见)")
    private Boolean status;

    /**
    * 发表时间
    */
    @ApiModelProperty(value = "发表时间")
    private LocalDateTime createTime;

    /**
    * 更新时间
    */
    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

}