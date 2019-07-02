package com.melon.sell.enums;


import lombok.Getter;

/**
 * ClassName ProductInfoRepository
 * Description
 * Author melon
 * Date 2019-07-01 16:42
 * Version
 */

@Getter
public enum ProductStatusEnum {

    /**
     * 商品上架状态
     */
    UP(0,"上架"),

    /**
     * 商品下架状态
     */
    DOWN(1,"下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code,String message) {
        this.code = code;
        this.message = message;
    }
}
