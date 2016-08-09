package com.httpclient.util;

import org.apache.http.client.config.RequestConfig;

/**
 * Created by Administrator on 2016/8/9.
 */
public class HttpClientTest {
    test te ;
    private RequestConfig requestConfig = RequestConfig.custom()
            .setSocketTimeout(15000)
            .setConnectTimeout(15000)
            .setConnectionRequestTimeout(15000)
            .build();

 /*   private static TestHttpClient instance = null;
    private TestHttpClient(){}
    public static TestHttpClient getInstance(){
        if (instance == null) {
            instance = new TestHttpClient();
        }
        return instance;
    }*/
    String aa;
    TRequest<SendHttpPost> request;
    public void ss(){
        request.sendHttpPost();
    }
}
