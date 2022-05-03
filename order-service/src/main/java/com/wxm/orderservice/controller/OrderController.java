package com.wxm.orderservice.controller;

import com.wxm.orderservice.domain.Order;
import com.wxm.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("{id}")
    public Order getOrder(@PathVariable(value = "id") String orderNum) {
        return orderService.getOrderByOrderNum(orderNum);
    }
}
