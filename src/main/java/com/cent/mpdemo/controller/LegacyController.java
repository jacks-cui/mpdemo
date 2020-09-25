package com.cent.mpdemo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cent.mpdemo.entity.Legacy;
import com.cent.mpdemo.service.ILegacyService;
import com.cent.mpdemo.utils.ResponseMpDataUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 布达拉宫遗产清单 前端控制器
 * </p>
 *
 * @author cui
 * @since 2020-09-01
 */
@RestController
@Api(value = "遗产管理")
@RequestMapping("/legacy")
public class LegacyController {
    @Autowired
    ILegacyService legacyService;

    @ApiOperation(value = "获取遗产清单")
    @GetMapping("list")
    List<Legacy> getLegacyList(){
       List<Legacy> legacyStream = legacyService.list().stream().filter(legacy -> legacy.getId() ==1 ).collect(Collectors.toList());

       legacyStream.forEach(n-> System.out.println(n.getLegacyPrimary()));
        return legacyStream;
    }

    @GetMapping("pageList")
    public Object getPageLegacyList(){
        int pageNum = 2;
        int pageSize = 2;

        Page page = new Page(pageNum,pageSize);
        Page pages = legacyService.page(page);
        return ResponseMpDataUtils.mpDto(pages);
    }

    public static void main(String[] args) {
        new Thread(() -> System.out.println("lembda")).start();

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }




}

