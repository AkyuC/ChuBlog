package com.chu.service.impl;

import com.chu.entity.Photo;
import com.chu.mapper.PhotoMapper;
import com.chu.service.PhotoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @auther chu
 * @create 2023-12-23
 * @describe 服务实现类
 */
@Service
public class PhotoServiceImp extends ServiceImpl<PhotoMapper, Photo> implements PhotoService {

}
