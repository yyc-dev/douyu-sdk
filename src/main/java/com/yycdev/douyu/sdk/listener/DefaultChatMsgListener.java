package com.yycdev.douyu.sdk.listener;

import com.yycdev.douyu.sdk.MessageListener;
import com.yycdev.douyu.sdk.entity.BaseMsg;
import com.yycdev.douyu.sdk.entity.ChatMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能描述：默认ChatMsg消息监听处理器
 *
 * @auther: liangjingkun
 * @date: 2018-07-08 21:23:08
 * 修改日志:
 */
public class DefaultChatMsgListener extends MessageListener<ChatMsg> {
    private final static Logger logger = LoggerFactory.getLogger(DefaultBaseMsgListener.class);

    @Override
    public void read(ChatMsg message) {
        logger.info(message.toChatStr());
    }
}
