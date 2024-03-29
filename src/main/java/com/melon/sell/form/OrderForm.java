package com.melon.sell.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * ClassName OrderForm
 * Description  表示进行表单验证的实体类
 * Author melon
 * Date 2019-07-03 14:43
 * Version
 */

@Data
public class OrderForm {

    /**
     * 买家姓名
     */
    @NotEmpty(message = "姓名必填")
    private String name;

    /**
     * 买家手机号
     */
    @NotEmpty(message = "手机号必填")
    private String phone;

    /**
     * 买家地址
     */
    @NotEmpty(message = "地址必填")
    private String address;

    /**
     * 买家openid
     */
    @NotEmpty(message = "openid必填")
    private String openid;

    /**
     * 购物车信息
     */
    @NotEmpty(message = "购物车不为空")
    private String items;
}
