package com.chu.mapper;

import com.chu.entity.SiteConfig;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @auther chu
 * @create 2023-12-23
 * @describe mapper类
 */
public interface SiteConfigMapper extends BaseMapper<SiteConfig> {
    /**
     * 插入一条记录
     *
     * @param entity 实体对象
     * @return 插入成功的条数
     */
    int insert(@Param("siteconfig") SiteConfig entity);

    /**
     * 插入一条记录，不插入null，使用默认值
     *
     * @param entity 实体对象
     * @return 插入成功的条数
     */
    int insertSelective(@Param("siteconfig") SiteConfig entity);

    /**
     * 根据 ID 删除记录
     *
     * @param id 记录 ID
     * @return 删除成功的条数
     */
    int deleteById(@Param("id") Long id);

    /**
     * 更新记录
     *
     * @param entity 实体对象
     * @return 更新成功的条数
     */
    int updateById(@Param("siteconfig") SiteConfig entity);

    /**
     * 更新记录，不更新null
     *
     * @param entity 实体对象
     * @return 更新成功的条数
     */
    int updateSelectiveById(@Param("siteconfig") SiteConfig entity);

    /**
     * 根据 ID 查询记录
     *
     * @param id 记录 ID
     * @return 查询到的实体对象
     */
    SiteConfig selectById(@Param("id") Long id);

    /**
     * 查询所有记录
     *
     * @return 所有记录的列表
     */
    List<SiteConfig> selectList();
}
