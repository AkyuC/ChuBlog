package com.chu.controller;

import com.chu.entity.Category;
import com.chu.service.CategoryService;
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
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    @ApiOperation(value = "列表查询",notes = "list")
    public List<Category> list(){
        return categoryService.list();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "查看详情",notes = "Category")
    public Category getCategoryById(@PathVariable Long id){
            return categoryService.getById(id);
    }

    @PostMapping
    @ApiOperation(value = "新增",notes = "Category")
    public boolean saveCategory(@RequestBody Category category){
            return categoryService.save(category);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "修改",notes = "Category")
    public boolean update(@PathVariable Long id, @RequestBody Category category){
        category.setId(Integer.parseInt(id.toString()));
        return categoryService.updateById(category);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除",notes = "Category")
    public boolean remove(@PathVariable Long id){
        return categoryService.removeById(id);
    }

}
