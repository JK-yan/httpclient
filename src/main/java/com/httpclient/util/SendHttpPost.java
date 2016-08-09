package com.httpclient.util;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

/**
 * Created by Administrator on 2016/8/9.
 */
public class SendHttpPost extends HttpBase {


    /**
     *
     * 发送 post请求
     * @param httpUrl 地址
     */

    public String sendHttpPost(String httpUrl){

        HttpPost httpPost = new HttpPost(httpUrl);
        // 创建httpPost
        return sendHttpPost(httpPost);
    }




    /**
     * * 发送 post请求
     * * @param httpUrl 地址
     * * @param params 参数(格式:key1=value1&key2=value2)
     * */
    public String sendHttpPost(String httpUrl, String params) {
        HttpPost httpPost = new HttpPost(httpUrl);
        // 创建httpPost
        try {
            //设置参数
            StringEntity stringEntity = new StringEntity(params, "UTF-8");
            stringEntity.setContentType("application/x-www-form-urlencoded");
            httpPost.setEntity(stringEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sendHttpPost(httpPost);
    }




}
