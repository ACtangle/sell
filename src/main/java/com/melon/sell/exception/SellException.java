package com.melon.sell.exception;

import com.melon.sell.enums.ResultEnum;

/**
 * ClassName SellException
 * Description TODO
 * Author melon
 * Date 2019-07-02 01:49
 * Version
 */

public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
