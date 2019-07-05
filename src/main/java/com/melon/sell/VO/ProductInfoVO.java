package com.melon.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.core.serializer.Serializer;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ClassName ProductInfoVO
 * Description 商品详情
 * Author melon
 * Date 2019-07-01 18:14
 * Version
 */

@Data
public class ProductInfoVO implements Serializable {


    private static final long serialVersionUID = -3681189541869333732L;

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
