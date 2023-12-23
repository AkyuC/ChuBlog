package com.chu.service.impl;

import com.chu.entity.Article;
import com.chu.mapper.ArticleMapper;
import com.chu.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @auther chu
 * @create 2023-12-23
 * @describe 服务实现类
 */
@Service
public class ArticleServiceImp extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
