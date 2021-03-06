package com.zjk.store.sms.service.impl;

import com.zjk.store.sms.entity.HomeSubject;
import com.zjk.store.sms.mapper.HomeSubjectMapper;
import com.zjk.store.sms.service.HomeSubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】 服务实现类
 * </p>
 *
 * @author zjk
 * @since 2022-01-11
 */
@Service
public class HomeSubjectServiceImpl extends ServiceImpl<HomeSubjectMapper, HomeSubject> implements HomeSubjectService {

}
