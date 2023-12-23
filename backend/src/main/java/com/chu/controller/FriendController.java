package com.chu.controller;

import com.chu.entity.Friend;
import com.chu.service.FriendService;
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
@RequestMapping("/friend")
public class FriendController {
    @Autowired
    private FriendService friendService;

    @GetMapping
    @ApiOperation(value = "列表查询",notes = "list")
    public List<Friend> list(){
        return friendService.list();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "查看详情",notes = "Friend")
    public Friend getFriendById(@PathVariable Long id){
            return friendService.getById(id);
    }

    @PostMapping
    @ApiOperation(value = "新增",notes = "Friend")
    public boolean saveFriend(@RequestBody Friend friend){
            return friendService.save(friend);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "修改",notes = "Friend")
    public boolean update(@PathVariable Long id, @RequestBody Friend friend){
        friend.setId(Integer.parseInt(id.toString()));
        return friendService.updateById(friend);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除",notes = "Friend")
    public boolean remove(@PathVariable Long id){
        return friendService.removeById(id);
    }

}
