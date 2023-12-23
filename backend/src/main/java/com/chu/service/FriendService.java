package com.chu.service;

import com.chu.entity.Friend;
import com.baomidou.mybatisplus.extension.service.IService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Service;

/**
 * @auther chu
 * @create 2023-12-23
 * @describe 服务类
 */
@Api(value = "Friend服务类")
@Service
public interface FriendService extends IService<Friend> {

}
