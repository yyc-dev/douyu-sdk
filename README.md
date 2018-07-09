<p align="center">
    <h3 align="center">DouYu-SDK</h3>
    <p align="center">
        DouYu-SDK,一个基于斗鱼弹幕API封装的SDK
        <br>
        (斗鱼弹幕服务器第三方接入协议v1.4.1)
        <br>
        <a href="#/">
            <img src="https://maven-badges.herokuapp.com/maven-central/com.xuxueli/xxl-emoji/badge.svg" >
        </a>
         <a href="http://www.gnu.org/licenses/gpl-3.0.html">
             <img src="https://img.shields.io/badge/license-GPLv3-blue.svg" >
         </a>
    </p>    
</p>


## 介绍

DouYu-SDK,一个基于斗鱼弹幕API封装的SDK

本SDK基于 斗鱼弹幕服务器第三方接入协议v1.4.1 进行封装

欢迎大家在每周周一到周六的晚上10点来到4835718听歌

## 安装
```
    <dependency>
        <groupId>com.yycdev</groupId>
        <artifactId>douyu-sdk</artifactId>
        <version>${最新稳定版}</version>
    </dependency>
```
PS:当前未上传到maven中央库，请自行下载源码后打包使用(2018年7月9日)
## 示例
引入Maven依赖，即可直接使用。

可参考以下示例代码：
```
    DouYuClient client = new DouYuClient("openbarrage.douyutv.com", 8601, "4835718");
    //注册普通弹幕消息处理器
    client.registerMessageListener(new MessageListener<ChatMsg>() {
        @Override
        public void read(ChatMsg message) {
            logger.info(message.toChatStr());
        }
    });
    //登录斗鱼服务器
    client.login();
    //开始同步到读取消息
    client.sync();
```
## 说明

目前支持监听的消息类型
```
//斗鱼推送的原消息
String

//通用消息实体(用于处理所有接收到的消息)
BaseMsg

//弹幕消息
ChatMsg

//赠送礼物消息
DgbMsg

//房间内用户抢红包消息
GgbbMsg

//礼物广播消息
SpbcMsg

//超级弹幕消息
SsdMsg

//用户进房通知消息
UenterMsg
```

## 注意事项

1.当接收到消息后会线生成一个BaseMsg实体再根据消息类型转换为其他各类消息实体

2.每一个实体中都会有UUID字段，该字段用于关联BaseMsg记录，是SDK自己生成的，非斗鱼API返回，如需要实现用id区分消息唯一暂无方案


