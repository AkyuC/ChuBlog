package com.chu.controller;

import com.chu.entity.Tag;
import com.chu.service.TagService;
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
@RequestMapping("/tag")
public class TagController {
    @Autowired
    private TagService tagService;

    @GetMapping
    @ApiOperation(value = "列表查询",notes = "list")
    public List<Tag> list(){
        return tagService.list();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "查看详情",notes = "Tag")
    public Tag getTagById(@PathVariable Long id){
            return tagService.getById(id);
    }

    @PostMapping
    @ApiOperation(value = "新增",notes = "Tag")
    public boolean saveTag(@RequestBody Tag tag){
            return tagService.save(tag);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "修改",notes = "Tag")
    public boolean update(@PathVariable Long id, @RequestBody Tag tag){
        tag.setId(Integer.parseInt(id.toString()));
        return tagService.updateById(tag);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除",notes = "Tag")
    public boolean remove(@PathVariable Long id){
        return tagService.removeById(id);
    }

}
