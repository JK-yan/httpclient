package com.httpclient.util;

/**
 * Created by Administrator on 2016/8/9.
 */
public class TRequest<T> extends HttpBase{
    private static final long serialVersionUID = 8256420723435390590L;
    private T                 condition;

    public T getCondition() {
        return condition;
    }

    public void setCondition(T condition) {
        this.condition = condition;
    }
}
