package com.yycdev.douyu.sdk.entity;

/**
 *
 * 功能描述：超级弹幕消息
 *
 * @auther: coffee
 * @date: 2018-07-09 10:24:53
 * 修改日志:
 *      
 */
public class SsdMsg implements MsgEntity{
    /**
     * 原消息
     */
    private String message;

    /**
     * 原消息ID
     */
    private String uuid;

    /**
     * 超级弹幕ID
     */
    private String sdid;

    /**
     * 房间ID
     */
    private String rid;

    /**
     * 弹幕组ID
     */
    private String gid;

    /**
     * 跳转房间ID
     */
    private String trid;

    /**
     * 超级弹幕内容
     */
    private String content;

    public String getSdid() {
        return sdid;
    }

    public void setSdid(String sdid) {
        this.sdid = sdid;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getTrid() {
        return trid;
    }

    public void setTrid(String trid) {
        this.trid = trid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    @Override
    public String toString() {
        return "SsdMsg{" +
                "sdid='" + sdid + '\'' +
                ", rid='" + rid + '\'' +
                ", gid='" + gid + '\'' +
                ", trid='" + trid + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
