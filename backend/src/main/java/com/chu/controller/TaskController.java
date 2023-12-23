package com.chu.controller;

import com.chu.entity.Task;
import com.chu.service.TaskService;
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
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping
    @ApiOperation(value = "列表查询",notes = "list")
    public List<Task> list(){
        return taskService.list();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "查看详情",notes = "Task")
    public Task getTaskById(@PathVariable Long id){
            return taskService.getById(id);
    }

    @PostMapping
    @ApiOperation(value = "新增",notes = "Task")
    public boolean saveTask(@RequestBody Task task){
            return taskService.save(task);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "修改",notes = "Task")
    public boolean update(@PathVariable Long id, @RequestBody Task task){
        task.setId(Integer.parseInt(id.toString()));
        return taskService.updateById(task);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除",notes = "Task")
    public boolean remove(@PathVariable Long id){
        return taskService.removeById(id);
    }

}
