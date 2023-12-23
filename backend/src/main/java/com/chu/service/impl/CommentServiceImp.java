package com.chu.service.impl;

import com.chu.entity.Comment;
import com.chu.mapper.CommentMapper;
import com.chu.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @auther chu
 * @create 2023-12-23
 * @describe 服务实现类
 */
@Service
public class CommentServiceImp extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
