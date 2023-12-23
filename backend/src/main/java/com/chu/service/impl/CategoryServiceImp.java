package com.chu.service.impl;

import com.chu.entity.Category;
import com.chu.mapper.CategoryMapper;
import com.chu.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @auther chu
 * @create 2023-12-23
 * @describe 服务实现类
 */
@Service
public class CategoryServiceImp extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
