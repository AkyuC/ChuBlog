package com.chu.service;

import com.chu.entity.Photo;
import com.baomidou.mybatisplus.extension.service.IService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Service;

/**
 * @auther chu
 * @create 2023-12-23
 * @describe 服务类
 */
@Api(value = "Photo服务类")
@Service
public interface PhotoService extends IService<Photo> {

}
