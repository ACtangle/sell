package com.melon.sell.utils;

import com.melon.sell.VO.ResultVO;

/**
 * ClassName ResultVOUtil
 * Description 返回前台封装的工具类
 * Author melon
 * Date 2019-07-01 18:51
 * Version
 */

public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {

        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

}