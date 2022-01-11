package com.zjk.store.oms.service.impl;

import com.zjk.store.oms.entity.Order;
import com.zjk.store.oms.mapper.OrderMapper;
import com.zjk.store.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单 服务实现类
 * </p>
 *
 * @author zjk
 * @since 2022-01-11
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
