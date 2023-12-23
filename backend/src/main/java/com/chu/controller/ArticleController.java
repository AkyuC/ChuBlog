package com.chu.controller;

import com.chu.entity.Article;
import com.chu.service.ArticleService;
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
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping
    @ApiOperation(value = "列表查询",notes = "list")
    public List<Article> list(){
        return articleService.list();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "查看详情",notes = "Article")
    public Article getArticleById(@PathVariable Long id){
            return articleService.getById(id);
    }

    @PostMapping
    @ApiOperation(value = "新增",notes = "Article")
    public boolean saveArticle(@RequestBody Article article){
            return articleService.save(article);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "修改",notes = "Article")
    public boolean update(@PathVariable Long id, @RequestBody Article article){
        article.setId(Integer.parseInt(id.toString()));
        return articleService.updateById(article);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除",notes = "Article")
    public boolean remove(@PathVariable Long id){
        return articleService.removeById(id);
    }

}
