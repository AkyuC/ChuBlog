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
@TableName("t_article_tag")
@ApiModel(value="ArticleTag对象", description="")
public class ArticleTag implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 主键
    */
    @TableId
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
    * 文章id
    */
    @ApiModelProperty(value = "文章id")
    private Integer articleId;

    /**
    * 标签id
    */
    @ApiModelProperty(value = "标签id")
    private Integer tagId;

}