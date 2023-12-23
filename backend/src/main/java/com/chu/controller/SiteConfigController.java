package com.chu.controller;

import com.chu.entity.SiteConfig;
import com.chu.service.SiteConfigService;
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
@RequestMapping("/siteConfig")
public class SiteConfigController {
    @Autowired
    private SiteConfigService siteConfigService;

    @GetMapping
    @ApiOperation(value = "列表查询",notes = "list")
    public List<SiteConfig> list(){
        return siteConfigService.list();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "查看详情",notes = "SiteConfig")
    public SiteConfig getSiteConfigById(@PathVariable Long id){
            return siteConfigService.getById(id);
    }

    @PostMapping
    @ApiOperation(value = "新增",notes = "SiteConfig")
    public boolean saveSiteConfig(@RequestBody SiteConfig siteConfig){
            return siteConfigService.save(siteConfig);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "修改",notes = "SiteConfig")
    public boolean update(@PathVariable Long id, @RequestBody SiteConfig siteConfig){
        siteConfig.setId(Integer.parseInt(id.toString()));
        return siteConfigService.updateById(siteConfig);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除",notes = "SiteConfig")
    public boolean remove(@PathVariable Long id){
        return siteConfigService.removeById(id);
    }

}
