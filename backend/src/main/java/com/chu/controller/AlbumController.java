package com.chu.controller;

import com.chu.entity.Album;
import com.chu.service.AlbumService;
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
@RequestMapping("/album")
public class AlbumController {
    @Autowired
    private AlbumService albumService;

    @GetMapping
    @ApiOperation(value = "列表查询",notes = "list")
    public List<Album> list(){
        return albumService.list();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "查看详情",notes = "Album")
    public Album getAlbumById(@PathVariable Long id){
            return albumService.getById(id);
    }

    @PostMapping
    @ApiOperation(value = "新增",notes = "Album")
    public boolean saveAlbum(@RequestBody Album album){
            return albumService.save(album);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "修改",notes = "Album")
    public boolean update(@PathVariable Long id, @RequestBody Album album){
        album.setId(Integer.parseInt(id.toString()));
        return albumService.updateById(album);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除",notes = "Album")
    public boolean remove(@PathVariable Long id){
        return albumService.removeById(id);
    }

}
