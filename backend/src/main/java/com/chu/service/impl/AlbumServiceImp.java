package com.chu.service.impl;

import com.chu.entity.Album;
import com.chu.mapper.AlbumMapper;
import com.chu.service.AlbumService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @auther chu
 * @create 2023-12-23
 * @describe 服务实现类
 */
@Service
public class AlbumServiceImp extends ServiceImpl<AlbumMapper, Album> implements AlbumService {

}
