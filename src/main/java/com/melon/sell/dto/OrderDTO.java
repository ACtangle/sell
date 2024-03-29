package com.melon.sell.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.melon.sell.pojo.OrderDetail;
import com.melon.sell.serializer.Date2LongSerializer;
import lombok.Data;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @ClassName OrderDTO
 * @Description
 * @Author melon
 * @Date 2019-07-02 01:36
 * @Version
 */



@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {
    /**
     * 订单id
     */
    private String orderId;

    /**
     * 买家名字
     */
    private String buyerName;

    /**
     * 买家手机号码
     */
    private String buyerPhone;

    /**
     * 买家地址
     */
    private String buyerAddress;

    /**
     * 买家微信openId
     */
    private String buyerOpenid;

    /**
     * 订单总金额
     */
    private BigDecimal orderAmount;

    /**
     * 订单状态，0默认新下单
     */
    private Integer orderStatus;

    /**
     * 支付状态，0默认未支付
     */
    private Integer payStatus;

    /**
     * 创建时间
     */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
