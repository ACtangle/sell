package com.melon.sell.enums;

import lombok.Getter;

/**
 * ClassName OrderStatusEnum
 * Description
 * Author melon
 * Date 2019-07-02 00:58
 * Version
 */

@Getter
public enum OrderStatusEnum {

    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消")
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
