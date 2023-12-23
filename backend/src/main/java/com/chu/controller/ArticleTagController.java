package com.chu.controller;

import com.chu.entity.ArticleTag;
import com.chu.service.ArticleTagService;
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
@RequestMapping("/articleTag")
public class ArticleTagController {
    @Autowired
    private ArticleTagService articleTagService;

    @GetMapping
    @ApiOperation(value = "列表查询",notes = "list")
    public List<ArticleTag> list(){
        return articleTagService.list();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "查看详情",notes = "ArticleTag")
    public ArticleTag getArticleTagById(@PathVariable Long id){
            return articleTagService.getById(id);
    }

    @PostMapping
    @ApiOperation(value = "新增",notes = "ArticleTag")
    public boolean saveArticleTag(@RequestBody ArticleTag articleTag){
            return articleTagService.save(articleTag);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "修改",notes = "ArticleTag")
    public boolean update(@PathVariable Long id, @RequestBody ArticleTag articleTag){
        articleTag.setId(Integer.parseInt(id.toString()));
        return articleTagService.updateById(articleTag);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除",notes = "ArticleTag")
    public boolean remove(@PathVariable Long id){
        return articleTagService.removeById(id);
    }

}
