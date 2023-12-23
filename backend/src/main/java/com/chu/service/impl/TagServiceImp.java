package com.chu.service.impl;

import com.chu.entity.Tag;
import com.chu.mapper.TagMapper;
import com.chu.service.TagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @auther chu
 * @create 2023-12-23
 * @describe 服务实现类
 */
@Service
public class TagServiceImp extends ServiceImpl<TagMapper, Tag> implements TagService {

}
