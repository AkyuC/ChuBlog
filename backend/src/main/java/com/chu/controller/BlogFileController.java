package com.chu.controller;

import com.chu.entity.BlogFile;
import com.chu.service.BlogFileService;
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
@RequestMapping("/blogFile")
public class BlogFileController {
    @Autowired
    private BlogFileService blogFileService;

    @GetMapping
    @ApiOperation(value = "列表查询",notes = "list")
    public List<BlogFile> list(){
        return blogFileService.list();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "查看详情",notes = "BlogFile")
    public BlogFile getBlogFileById(@PathVariable Long id){
            return blogFileService.getById(id);
    }

    @PostMapping
    @ApiOperation(value = "新增",notes = "BlogFile")
    public boolean saveBlogFile(@RequestBody BlogFile blogFile){
            return blogFileService.save(blogFile);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "修改",notes = "BlogFile")
    public boolean update(@PathVariable Long id, @RequestBody BlogFile blogFile){
        blogFile.setId(Integer.parseInt(id.toString()));
        return blogFileService.updateById(blogFile);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除",notes = "BlogFile")
    public boolean remove(@PathVariable Long id){
        return blogFileService.removeById(id);
    }

}
