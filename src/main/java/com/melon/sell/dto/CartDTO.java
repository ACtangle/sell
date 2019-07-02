package com.melon.sell.dto;

import lombok.Data;

/**
 * ClassName CartDTO
 * Description TODO
 * Author melon
 * Date 2019-07-02 02:13
 * Version
 */

@Data
public class CartDTO {


    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
