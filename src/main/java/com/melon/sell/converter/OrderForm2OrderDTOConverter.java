package com.melon.sell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.melon.sell.dto.OrderDTO;
import com.melon.sell.enums.ResultEnum;
import com.melon.sell.exception.SellException;
import com.melon.sell.form.OrderForm;
import com.melon.sell.pojo.OrderDetail;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName OrderForm2OrderDTO
 * Description
 * Author melon
 * Date 2019-07-03 15:01
 * Version
 */

@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm) {

        Gson gson = new Gson();

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());


        List<OrderDetail> orderDetailList = new ArrayList<>();
        //将表单的json数据转换为类属性数据
        try {
            orderDetailList = gson.fromJson(
                    orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {}.getType()
            );
        }catch (Exception e) {
            log.error("对象转换错误, string = {}",orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }

        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }

}
