package com.yycdev.douyu;

import com.yycdev.douyu.sdk.DouYuClient;
import com.yycdev.douyu.sdk.MessageListener;
import com.yycdev.douyu.sdk.entity.ChatMsg;
import com.yycdev.douyu.sdk.listener.DefaultBaseMsgListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能描述：
 *
 * @auther: coffee
 * @date: 2018-07-04 19:37:41
 * 修改日志:
 */
public class Main {
    private final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        DouYuClient client = new DouYuClient("openbarrage.douyutv.com", 8601, "4835718");
        client.registerMessageListener(new MessageListener<ChatMsg>() {
            @Override
            public void read(ChatMsg message) {
                //logger.info(message.toChatStr());
            }
        });
        client.registerMessageListener(new MessageListener<String>() {
            @Override
            public void read(String message) {
                logger.info(message);
            }
        });
        client.login();
        client.sync();
    }
}
