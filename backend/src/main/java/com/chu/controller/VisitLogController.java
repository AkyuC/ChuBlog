package com.chu.controller;

import com.chu.entity.VisitLog;
import com.chu.service.VisitLogService;
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
@RequestMapping("/visitLog")
public class VisitLogController {
    @Autowired
    private VisitLogService visitLogService;

    @GetMapping
    @ApiOperation(value = "列表查询",notes = "list")
    public List<VisitLog> list(){
        return visitLogService.list();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "查看详情",notes = "VisitLog")
    public VisitLog getVisitLogById(@PathVariable Long id){
            return visitLogService.getById(id);
    }

    @PostMapping
    @ApiOperation(value = "新增",notes = "VisitLog")
    public boolean saveVisitLog(@RequestBody VisitLog visitLog){
            return visitLogService.save(visitLog);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "修改",notes = "VisitLog")
    public boolean update(@PathVariable Long id, @RequestBody VisitLog visitLog){
        visitLog.setId(Integer.parseInt(id.toString()));
        return visitLogService.updateById(visitLog);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除",notes = "VisitLog")
    public boolean remove(@PathVariable Long id){
        return visitLogService.removeById(id);
    }

}
