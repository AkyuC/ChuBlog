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
@TableName("t_blog_file")
@ApiModel(value="BlogFile对象", description="")
public class BlogFile implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 文件id
    */
    @TableId
    @ApiModelProperty(value = "文件id")
    private Integer id;

    /**
    * 文件url
    */
    @ApiModelProperty(value = "文件url")
    private String fileUrl;

    /**
    * 文件名
    */
    @ApiModelProperty(value = "文件名")
    private String fileName;

    /**
    * 文件大小
    */
    @ApiModelProperty(value = "文件大小")
    private Integer fileSize;

    /**
    * 文件类型
    */
    @ApiModelProperty(value = "文件类型")
    private String fileType;

    /**
    * 文件路径
    */
    @ApiModelProperty(value = "文件路径")
    private String filePath;

    /**
    * 是否为目录 (0否 1是)
    */
    @ApiModelProperty(value = "是否为目录 (0否 1是)")
    private Boolean isDir;

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