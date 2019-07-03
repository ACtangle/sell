package com.melon.sell.service.impl;

import com.melon.sell.dto.OrderDTO;
import com.melon.sell.enums.ResultEnum;
import com.melon.sell.exception.SellException;
import com.melon.sell.service.BuyerService;
import com.melon.sell.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName BuyerService
 * @Description
 * @Author melon
 * @Date 2019-07-03 17:14
 * @Version
 */

@Slf4j
@Service
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private OrderService orderService;

    @Override
    public OrderDTO findOrderOne(String openid, String orderId) {

        return checkOwnerOrder(openid, orderId);
    }


    @Override
    public OrderDTO cancelOrder(String openid, String orderId) {

        OrderDTO orderDTO = checkOwnerOrder(openid, orderId);
        if (null == orderDTO) {
            log.error("[取消订单] 查不到该订单,orderId = {}", orderId);
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }

        return orderService.cancel(orderDTO);
    }


    private OrderDTO checkOwnerOrder(String openid, String orderId) {
        OrderDTO orderDTO = orderService.findOne(orderId);

        if (orderDTO == null) {
            return null;
        }
        //判断是自己的订单
        if (orderDTO.getBuyerOpenid().equalsIgnoreCase(openid)) {
            log.error("[查询订单] 订单的openid不一致，openid = {}, orderId = {}", openid, orderId);
            throw new SellException(ResultEnum.ORDER_OWNER_ERROR);
        }

        return orderDTO;
    }
}
