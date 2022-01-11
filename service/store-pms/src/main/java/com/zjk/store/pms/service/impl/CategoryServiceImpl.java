package com.zjk.store.pms.service.impl;

import com.zjk.store.pms.entity.Category;
import com.zjk.store.pms.mapper.CategoryMapper;
import com.zjk.store.pms.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品三级分类 服务实现类
 * </p>
 *
 * @author zjk
 * @since 2022-01-11
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
