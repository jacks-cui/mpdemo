package com.cent.mpdemo.service.impl;

import com.cent.mpdemo.entity.Legacy;
import com.cent.mpdemo.mapper.LegacyMapper;
import com.cent.mpdemo.service.ILegacyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 布达拉宫遗产清单 服务实现类
 * </p>
 *
 * @author cui
 * @since 2020-09-01
 */
@Service
public class LegacyServiceImpl extends ServiceImpl<LegacyMapper, Legacy> implements ILegacyService {
    @Autowired
    LegacyMapper legacyMapper;
}
