package com.melon.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * ClassName ProductVO
 * Description 商品（包含类目）
 * Author melon
 * Date 2019-07-01 18:10
 * Version
 */

@Data
public class ProductVO implements Serializable  {


    private static final long serialVersionUID = -8805989549096060931L;

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
