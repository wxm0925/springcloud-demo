package com.wxm.orderservice.service;

import com.wxm.orderservice.domain.Order;

public interface OrderService {

    /**
     * 查询订单
     * @param orderNum 订单号
     * @return
     */
    Order getOrderByOrderNum(String orderNum);
}
