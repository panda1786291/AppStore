package com.zjk.store.oms.controller;


import com.zjk.store.common_utils.R;
import com.zjk.store.oms.entity.Order;
import com.zjk.store.oms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 订单 前端控制器
 * </p>
 *
 * @author zjk
 * @since 2022-01-11
 */
@RestController
@RequestMapping("/oms/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("lis")
    public R getList(){
        Order order = orderService.getById(1);
        if (order!=null){
            R r = R.ok().data("order", order);
            return r;
        }
        else {
            R error = R.error();
            return error;
        }
    }
}

