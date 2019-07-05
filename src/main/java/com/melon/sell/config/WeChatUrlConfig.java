package com.melon.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName WeChatUrlConfig
 * @Description
 * @Author melon
 * @Date 2019-07-05 15:35
 * @Version
 */

@ConfigurationProperties("wechatUrl")
@Component
@Data
public class WeChatUrlConfig {

    private String root;
}
