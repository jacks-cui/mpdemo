package com.cent.mpdemo.utils;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.HashMap;
import java.util.Map;

public class ResponseMpDataUtils {
    public static Map<String,Object> mpDto(Page<?> page) {
        Map<String,Object> objectMap = new HashMap<>(1024);
        objectMap.put("list", page.getRecords());
        objectMap.put("total", page.getTotal());
        objectMap.put("pageSize", page.getSize());
        objectMap.put("pageNum", page.getPages());
        return objectMap;
    }
}
