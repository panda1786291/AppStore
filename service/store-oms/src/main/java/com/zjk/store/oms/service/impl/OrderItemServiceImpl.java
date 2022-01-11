package com.zjk.store.oms.service.impl;

import com.zjk.store.oms.entity.OrderItem;
import com.zjk.store.oms.mapper.OrderItemMapper;
import com.zjk.store.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单项信息 服务实现类
 * </p>
 *
 * @author zjk
 * @since 2022-01-11
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
