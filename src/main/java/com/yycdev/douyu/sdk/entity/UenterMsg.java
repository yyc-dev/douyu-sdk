package com.yycdev.douyu.sdk.entity;

/**
 *
 * 功能描述：用户进房通知消息
 *
 * @auther: liangjingkun
 * @date: 2018-07-09 00:28:36
 * 修改日志:
 *      
 */
public class UenterMsg implements MsgEntity{
    /**
     * 原消息
     */
    private String message;

    /**
     * 原消息ID
     */
    private String uuid;

    /**
     * 房间ID
     */
    private String rid;

    /**
     * 弹幕组ID
     */
    private String gid;

    /**
     * 用户ID
     */
    private String uid;

    /**
     * 用户昵称
     */
    private String nn;

    /**
     * 用户等级
     */
    private String level;

    /**
     * 礼物头衔：默认值 0（表示没有头衔）
     */
    private String gt;

    /**
     * 房间权限组：默认值 1（表示普通权限用户）
     */
    private String rg;

    /**
     * 平台权限组：默认值 1（表示普通权限用户）
     */
    private String pg;

    /**
     * 用户头像
     */
    private String ic;

    /**
     * 贵族等级
     */
    private String nl;

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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNn() {
        return nn;
    }

    public void setNn(String nn) {
        this.nn = nn;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getPg() {
        return pg;
    }

    public void setPg(String pg) {
        this.pg = pg;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNl() {
        return nl;
    }

    public void setNl(String nl) {
        this.nl = nl;
    }

    @Override
    public String toString() {
        return "UenterMsg{" +
                "rid='" + rid + '\'' +
                ", gid='" + gid + '\'' +
                ", uid='" + uid + '\'' +
                ", nn='" + nn + '\'' +
                ", level='" + level + '\'' +
                ", gt='" + gt + '\'' +
                ", rg='" + rg + '\'' +
                ", pg='" + pg + '\'' +
                ", ic='" + ic + '\'' +
                ", nl='" + nl + '\'' +
                '}';
    }
}
