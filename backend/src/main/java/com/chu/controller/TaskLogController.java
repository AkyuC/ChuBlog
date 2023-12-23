package com.chu.controller;

import com.chu.entity.TaskLog;
import com.chu.service.TaskLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


import org.springframework.web.bind.annotation.RestController;

/**
 *
 *  前端控制器
 * @author chu
 * @since 2023-12-23
 */

@RestController
@Api(value ="")
@RequestMapping("/taskLog")
public class TaskLogController {
    @Autowired
    private TaskLogService taskLogService;

    @GetMapping
    @ApiOperation(value = "列表查询",notes = "list")
    public List<TaskLog> list(){
        return taskLogService.list();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "查看详情",notes = "TaskLog")
    public TaskLog getTaskLogById(@PathVariable Long id){
            return taskLogService.getById(id);
    }

    @PostMapping
    @ApiOperation(value = "新增",notes = "TaskLog")
    public boolean saveTaskLog(@RequestBody TaskLog taskLog){
            return taskLogService.save(taskLog);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "修改",notes = "TaskLog")
    public boolean update(@PathVariable Long id, @RequestBody TaskLog taskLog){
        taskLog.setId(Integer.parseInt(id.toString()));
        return taskLogService.updateById(taskLog);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除",notes = "TaskLog")
    public boolean remove(@PathVariable Long id){
        return taskLogService.removeById(id);
    }

}
