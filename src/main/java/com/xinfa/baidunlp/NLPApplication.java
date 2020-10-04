package com.xinfa.baidunlp;

import org.springframework.web.client.RestTemplate;

/**
 * 整个自然语言处理的类
 */
public class NLPApplication {
    public NLPApplication( ) {
        this.restTemplate = new RestTemplate();
    }

    private  RestTemplate restTemplate;//使用RestTemplate向百度的服务器发起请求
    private Token token;//鉴权认证返回的对象

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

}
