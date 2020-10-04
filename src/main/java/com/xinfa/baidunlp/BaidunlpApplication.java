package com.xinfa.baidunlp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;


@SpringBootApplication
public class BaidunlpApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaidunlpApplication.class, args);
        NLPApplication  nlpApplication= new NLPApplication();//新建自然语言处理类
        try{
            nlpApplication.setToken(nlpApplication.getRestTemplate().getForObject("https://aip.baidubce.com/oauth/2.0/token?grant_type=client_credentials&client_id=你的id&client_secret=你的key"
                    , Token.class));
        }
        catch (RestClientException e){
            System.out.println("鉴权失败");
            return;
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        MultiValueMap<String, String> map= new LinkedMultiValueMap<>();
        map.add("text", "百度是一家人工智能公司");
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
        String url = "https://aip.baidubce.com/rpc/2.0/nlp/v1/ecnet?charset=UTF-8&access_token="+nlpApplication.getToken().getAccess_token();
        ResponseEntity<TextCorrect> response = nlpApplication.getRestTemplate().postForEntity( url, request , TextCorrect.class );
        System.out.println(response.getBody());
    }
}
