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
@TableName("t_site_config")
@ApiModel(value="SiteConfig对象", description="")
public class SiteConfig implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
    * 主键
    */
    @TableId
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
    * 网站名称
    */
    @ApiModelProperty(value = "网站名称")
    private String siteName;

    /**
    * 网站地址
    */
    @ApiModelProperty(value = "网站地址")
    private String siteAddress;

    /**
    * 网站简介
    */
    @ApiModelProperty(value = "网站简介")
    private String siteIntro;

    /**
    * 网站公告
    */
    @ApiModelProperty(value = "网站公告")
    private String siteNotice;

    /**
    * 建站日期
    */
    @ApiModelProperty(value = "建站日期")
    private String createSiteTime;

    /**
    * 备案号
    */
    @ApiModelProperty(value = "备案号")
    private String recordNumber;

    /**
    * 作者头像
    */
    @ApiModelProperty(value = "作者头像")
    private String authorAvatar;

    /**
    * 游客头像
    */
    @ApiModelProperty(value = "游客头像")
    private String touristAvatar;

    /**
    * 网站作者
    */
    @ApiModelProperty(value = "网站作者")
    private String siteAuthor;

    /**
    * 文章默认封面
    */
    @ApiModelProperty(value = "文章默认封面")
    private String articleCover;

    /**
    * 关于我
    */
    @ApiModelProperty(value = "关于我")
    private String aboutMe;

    /**
    * Github
    */
    @ApiModelProperty(value = "Github")
    private String github;

    /**
    * Gitee
    */
    @ApiModelProperty(value = "Gitee")
    private String email;

    /**
    * 是否评论审核 (0否 1是)
    */
    @ApiModelProperty(value = "是否评论审核 (0否 1是)")
    private Boolean commentCheck;

    /**
    * 是否邮箱通知 (0否 1是)
    */
    @ApiModelProperty(value = "是否邮箱通知 (0否 1是)")
    private Boolean emailNotice;

    /**
    * websocket链接
    */
    @ApiModelProperty(value = "websocket链接")
    private String websocketUrl;

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