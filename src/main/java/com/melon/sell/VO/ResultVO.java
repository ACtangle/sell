package com.melon.sell.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * ClassName ResultVO
 * Description http请求返回的最外层对象
 * Author melon
 * Date 2019-07-01 17:53
 * Version
 */

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO<T> implements Serializable {


    private static final long serialVersionUID = -1726098561298117601L;

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
