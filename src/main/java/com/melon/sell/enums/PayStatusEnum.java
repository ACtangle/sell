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
public enum PayStatusEnum {

    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功")
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

