package com.melon.sell.service;

import com.melon.sell.dto.OrderDTO;

/**
 * @ClassName BuyerService
 * @Description 买家
 * @Author melon
 * @Date 2019-07-03 17:12
 * @Version
 */


public interface BuyerService {
    /**
     * 查询一个订单
     *
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO findOrderOne(String openid, String orderId);

    /**
     * 取消订单
     *
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO cancelOrder(String openid, String orderId);

}
