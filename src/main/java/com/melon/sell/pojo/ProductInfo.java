package com.melon.sell.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * ClassName ProductInfo
 * Description TODO
 * Author melon
 * Date 2019-07-01 16:37
 * Version
 */

@Entity
@Data
public class ProductInfo {

    /**
     * 商品id
     */
    @Id
    private String productId;

    /**
     * 商品名字
     */
    private String productName;

    /**
     * 商品单价
     */
    private BigDecimal productPrice;

    /**
     * 商品库存
     */
    private Integer productStock;

    /**
     * 商品描述
     */
    private String productDescription;

    /**
     * 商品小图
     */
    private String productIcon;

    /**
     * 商品状态，0正常，1下架
     */
    private Integer productStatus;

    /**
     * 类目编号
     */
    private Integer categoryType;
}
