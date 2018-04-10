package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * @author Jiang-gege
 * 2018/4/39:38
 */
public interface OrderService {

    //创建订单
    OrderDTO create(OrderDTO orderDTO);
    //查询订单列表
    //取消订单
    // 完结订单
    //支付订单
}