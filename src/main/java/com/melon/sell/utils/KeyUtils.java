package com.melon.sell.utils;

import java.util.Random;

/**
 * ClassName KeyUtils
 * Description 生成唯一键工具类
 * Author melon
 * Date 2019-07-02 02:02
 * Version
 */

public class KeyUtils {

    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     * synchronized加锁避免并发
     * @return String
     */
    public static synchronized  String genUniqueKey() {

        Random random  = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return  System.currentTimeMillis() + String.valueOf(number);

    }
}
