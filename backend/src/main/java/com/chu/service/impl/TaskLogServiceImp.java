package com.chu.service.impl;

import com.chu.entity.TaskLog;
import com.chu.mapper.TaskLogMapper;
import com.chu.service.TaskLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @auther chu
 * @create 2023-12-23
 * @describe 服务实现类
 */
@Service
public class TaskLogServiceImp extends ServiceImpl<TaskLogMapper, TaskLog> implements TaskLogService {

}
