package com.wxm.orderservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxm.feignclient.user.UserClient;
import com.wxm.feignclient.user.dto.UserDTO;
import com.wxm.orderservice.domain.Order;
import com.wxm.orderservice.mapper.OrderMapper;
import com.wxm.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author wen_xm
* @description 针对表【t_order】的数据库操作Service实现
* @createDate 2022-05-01 23:59:23
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserClient userClient;

    /**
     * 查询订单
     * @param orderNum 订单号
     * @return
     */
    @Override
    public Order getOrderByOrderNum(String orderNum) {
        UserDTO userDTO = userClient.getUserByUserId("aaa");
        System.out.println(userDTO);
        return orderMapper.selectById(orderNum);
    }
}




