package com.yycdev.douyu.sdk.entity;

/**
 * 功能描述：错误消息
 * <p>
 * 0            操作成功
 * 51           数据传输出错
 * 52           服务器关闭
 * 204          房间id错误
 *
 * @auther: coffee
 * @date: 2018-07-16 16:09:02
 * 修改日志:
 */
public class ErrorMsg implements MsgEntity {
    /**
     * 原消息
     */
    private String message;

    /**
     * 原消息ID
     */
    private String uuid;

    /**
     * 错误代码
     */
    private String code;

    /**
     * 错误描述
     */
    private String desc;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        if (desc == null && code != null) {
            switch (code) {
                case "0":
                    desc = "斗鱼弹幕客户端-操作成功";
                    break;
                case "51":
                    desc = "斗鱼弹幕客户端-数据传输出错";
                    break;
                case "52":
                    desc = "斗鱼弹幕客户端-服务已登出 或 服务器关闭";
                    break;
                case "204":
                    desc = "斗鱼弹幕客户端-房间ID错误";
                    break;
            }
        }
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getUuid() {
        return uuid;
    }

    @Override
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
