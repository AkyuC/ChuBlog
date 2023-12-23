package com.chu.controller;

import com.chu.entity.ExceptionLog;
import com.chu.service.ExceptionLogService;
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
@RequestMapping("/exceptionLog")
public class ExceptionLogController {
    @Autowired
    private ExceptionLogService exceptionLogService;

    @GetMapping
    @ApiOperation(value = "列表查询",notes = "list")
    public List<ExceptionLog> list(){
        return exceptionLogService.list();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "查看详情",notes = "ExceptionLog")
    public ExceptionLog getExceptionLogById(@PathVariable Long id){
            return exceptionLogService.getById(id);
    }

    @PostMapping
    @ApiOperation(value = "新增",notes = "ExceptionLog")
    public boolean saveExceptionLog(@RequestBody ExceptionLog exceptionLog){
            return exceptionLogService.save(exceptionLog);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "修改",notes = "ExceptionLog")
    public boolean update(@PathVariable Long id, @RequestBody ExceptionLog exceptionLog){
        exceptionLog.setId(Integer.parseInt(id.toString()));
        return exceptionLogService.updateById(exceptionLog);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除",notes = "ExceptionLog")
    public boolean remove(@PathVariable Long id){
        return exceptionLogService.removeById(id);
    }

}
