package com.chu.controller;

import com.chu.entity.Comment;
import com.chu.service.CommentService;
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
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping
    @ApiOperation(value = "列表查询",notes = "list")
    public List<Comment> list(){
        return commentService.list();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "查看详情",notes = "Comment")
    public Comment getCommentById(@PathVariable Long id){
            return commentService.getById(id);
    }

    @PostMapping
    @ApiOperation(value = "新增",notes = "Comment")
    public boolean saveComment(@RequestBody Comment comment){
            return commentService.save(comment);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "修改",notes = "Comment")
    public boolean update(@PathVariable Long id, @RequestBody Comment comment){
        comment.setId(Integer.parseInt(id.toString()));
        return commentService.updateById(comment);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除",notes = "Comment")
    public boolean remove(@PathVariable Long id){
        return commentService.removeById(id);
    }

}
