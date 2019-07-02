package com.melon.sell.VO;

import lombok.Data;

/**
 * ClassName ResultVO
 * Description http请求返回的最外层对象
 * Author melon
 * Date 2019-07-01 17:53
 * Version
 */

@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 返回的具体内容
     */
    private T data;
}
