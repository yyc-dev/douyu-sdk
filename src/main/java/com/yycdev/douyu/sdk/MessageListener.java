package com.yycdev.douyu.sdk;

import java.lang.reflect.ParameterizedType;

/**
 * 功能描述：消息监听器
 *
 * @auther: liangjingkun
 * @date: 2018-07-04 16:22:22
 * 修改日志:
 */
public abstract class MessageListener<T> {

    private Class<T> msgClazz;

    public MessageListener() {
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        this.msgClazz = (Class<T>) type.getActualTypeArguments()[0];
    }

    /**
     * 消息读取
     */
    public abstract void read(T message);

    public Class<T> getMsgClazz() {
        return msgClazz;
    }
}
