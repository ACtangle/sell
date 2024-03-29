package com.melon.sell.controller;

import com.melon.sell.config.WeChatUrlConfig;
import com.melon.sell.enums.ResultEnum;
import com.melon.sell.exception.SellException;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URLEncoder;

/**
 * @ClassName WechatController
 * @Description
 * @Author melon
 * @Date 2019-07-05 15:07
 * @Version
 */

@Controller
@RequestMapping("/wechat")
@Slf4j
public class WechatController {

    @Autowired
    private  WxMpService wxMpService;

    @Autowired
    private WeChatUrlConfig weChatUrlConfig;

    @GetMapping(value = "/authorize")
    public String authorize(@RequestParam("returnUrl")String returnUrl){

        String url = weChatUrlConfig.getRoot() + "userInfo";
        String redirectUrl = wxMpService.oauth2buildAuthorizationUrl(url,WxConsts.OAUTH2_SCOPE_USER_INFO, URLEncoder.encode(returnUrl));
        log.info("[微信网页授权]，获取code；result ：{}",redirectUrl);
         return "redirect:" + redirectUrl;
    }

    @GetMapping("/userInfo")
    public String useInfo(@RequestParam("code")String code,
                        @RequestParam("state") String returnUrl) {

        WxMpOAuth2AccessToken wxMpOAuth2AccessToken = new WxMpOAuth2AccessToken();
        try {
            wxMpOAuth2AccessToken = wxMpService.oauth2getAccessToken(code);
        }catch (WxErrorException e) {
            log.info("[微信网页授权],{}",e);
            throw new SellException(ResultEnum.WX_MP_ERROR.getCode(),e.getError().getErrorMsg());
        }
        String openId = wxMpOAuth2AccessToken.getOpenId();
        return "redirect:" + "returnUrl" + "?openid=" + openId;
    }
}
