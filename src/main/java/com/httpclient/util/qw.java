package com.httpclient.util;

import org.apache.http.client.methods.HttpPost;

/**
 * Created by Administrator on 2016/8/9.
 */
public class qw extends SendHttpPost {
    @Override
    public String sendHttpPost(HttpPost httpPost) {
        return super.sendHttpPost(this.sendHttpPost("dasdasd"));
    }
}
