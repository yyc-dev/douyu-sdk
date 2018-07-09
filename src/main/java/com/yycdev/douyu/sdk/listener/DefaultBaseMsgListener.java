package com.yycdev.douyu.sdk.listener;

import com.yycdev.douyu.sdk.MessageListener;
import com.yycdev.douyu.sdk.entity.BaseMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * 功能描述：默认的BaseMsg消息监听器
 *
 * @auther: coffee
 * @date: 2018-07-07 18:48:48
 * 修改日志:
 *      
 */
public class DefaultBaseMsgListener extends MessageListener<BaseMsg> {
    private final static Logger logger = LoggerFactory.getLogger(DefaultBaseMsgListener.class);
    @Override
    public void read(BaseMsg message) {
        logger.info(message.toString());
    }
}
