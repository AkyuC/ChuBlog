package com.chu.controller;

import com.chu.entity.Photo;
import com.chu.service.PhotoService;
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
@RequestMapping("/photo")
public class PhotoController {
    @Autowired
    private PhotoService photoService;

    @GetMapping
    @ApiOperation(value = "列表查询",notes = "list")
    public List<Photo> list(){
        return photoService.list();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "查看详情",notes = "Photo")
    public Photo getPhotoById(@PathVariable Long id){
            return photoService.getById(id);
    }

    @PostMapping
    @ApiOperation(value = "新增",notes = "Photo")
    public boolean savePhoto(@RequestBody Photo photo){
            return photoService.save(photo);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "修改",notes = "Photo")
    public boolean update(@PathVariable Long id, @RequestBody Photo photo){
        photo.setId(Integer.parseInt(id.toString()));
        return photoService.updateById(photo);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除",notes = "Photo")
    public boolean remove(@PathVariable Long id){
        return photoService.removeById(id);
    }

}
