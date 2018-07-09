package com.yycdev.douyu.sdk.entity;

/**
 *
 * 功能描述：赠送礼物
 *
 * @auther: coffee
 * @date: 2018-07-08 23:59:55
 * 修改日志:
 *      
 */
public class DgbMsg implements MsgEntity{
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
     * 礼物ID
     */
    private String gfid;

    /**
     * 礼物显示样式
     */
    private String gs;

    /**
     * 用户ID
     */
    private String uid;

    /**
     * 用户昵称
     */
    private String nn;

    /**
     * 大礼物标识：默认值为 0（表示是小礼物）
     */
    private String bg;

    /**
     * 礼物个数：默认值 1（表示 1 个礼物）
     */
    private String gfcnt;

    /**
     * 礼物连击次数：默认值 1（表示 1 连击）
     */
    private String hits;

    /**
     * 贵族等级
     */
    private String nl;

    /**
     * 粉丝牌名称
     */
    private String bnn;

    /**
     * 粉丝牌等级
     */
    private String bl;

    /**
     * 粉丝牌关联房间号
     */
    private String brid;

    /**
     * 徽章信息校验码
     */
    private String hc;

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

    public String getGfid() {
        return gfid;
    }

    public void setGfid(String gfid) {
        this.gfid = gfid;
    }

    public String getGs() {
        return gs;
    }

    public void setGs(String gs) {
        this.gs = gs;
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

    public String getBg() {
        return bg;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }

    public String getGfcnt() {
        return gfcnt;
    }

    public void setGfcnt(String gfcnt) {
        this.gfcnt = gfcnt;
    }

    public String getHits() {
        return hits;
    }

    public void setHits(String hits) {
        this.hits = hits;
    }

    public String getNl() {
        return nl;
    }

    public void setNl(String nl) {
        this.nl = nl;
    }

    public String getBnn() {
        return bnn;
    }

    public void setBnn(String bnn) {
        this.bnn = bnn;
    }

    public String getBl() {
        return bl;
    }

    public void setBl(String bl) {
        this.bl = bl;
    }

    public String getBrid() {
        return brid;
    }

    public void setBrid(String brid) {
        this.brid = brid;
    }

    public String getHc() {
        return hc;
    }

    public void setHc(String hc) {
        this.hc = hc;
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
        return "DgbMsg{" +
                "rid='" + rid + '\'' +
                ", gid='" + gid + '\'' +
                ", gfid='" + gfid + '\'' +
                ", gs='" + gs + '\'' +
                ", uid='" + uid + '\'' +
                ", nn='" + nn + '\'' +
                ", bg='" + bg + '\'' +
                ", gfcnt='" + gfcnt + '\'' +
                ", hits='" + hits + '\'' +
                ", nl='" + nl + '\'' +
                ", bnn='" + bnn + '\'' +
                ", bl='" + bl + '\'' +
                ", brid='" + brid + '\'' +
                ", hc='" + hc + '\'' +
                '}';
    }
}
