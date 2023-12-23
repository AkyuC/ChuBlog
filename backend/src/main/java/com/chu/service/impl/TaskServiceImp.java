package com.chu.service.impl;

import com.chu.entity.Task;
import com.chu.mapper.TaskMapper;
import com.chu.service.TaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @auther chu
 * @create 2023-12-23
 * @describe 服务实现类
 */
@Service
public class TaskServiceImp extends ServiceImpl<TaskMapper, Task> implements TaskService {

}
