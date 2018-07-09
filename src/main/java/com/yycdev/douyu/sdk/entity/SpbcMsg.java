package com.yycdev.douyu.sdk.entity;

/**
 *
 * 功能描述：礼物广播消息
 *
 * @auther: coffee
 * @date: 2018-07-09 10:28:48
 * 修改日志:
 *      
 */
public class SpbcMsg implements MsgEntity{
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
     * 赠送者昵称
     */
    private String sn;

    /**
     * 受赠者昵称
     */
    private String dn;

    /**
     * 礼物名称
     */
    private String gn;

    /**
     * 礼物数量
     */
    private String gc;

    /**
     * 赠送房间
     */
    private String drid;

    /**
     * 广播样式
     */
    private String gs;

    /**
     * 是否有礼包（0-无礼包，1-有礼包）
     */
    private String gb;

    /**
     * 广播展现样式（1-火箭，2-飞机）
     */
    private String es;

    /**
     * 礼物 id
     */
    private String gfid;

    /**
     * 特效 id
     */
    private String eid;

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

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public String getGn() {
        return gn;
    }

    public void setGn(String gn) {
        this.gn = gn;
    }

    public String getGc() {
        return gc;
    }

    public void setGc(String gc) {
        this.gc = gc;
    }

    public String getDrid() {
        return drid;
    }

    public void setDrid(String drid) {
        this.drid = drid;
    }

    public String getGs() {
        return gs;
    }

    public void setGs(String gs) {
        this.gs = gs;
    }

    public String getGb() {
        return gb;
    }

    public void setGb(String gb) {
        this.gb = gb;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public String getGfid() {
        return gfid;
    }

    public void setGfid(String gfid) {
        this.gfid = gfid;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    @Override
    public String toString() {
        return "SpbcMsg{" +
                "rid='" + rid + '\'' +
                ", gid='" + gid + '\'' +
                ", sn='" + sn + '\'' +
                ", dn='" + dn + '\'' +
                ", gn='" + gn + '\'' +
                ", gc='" + gc + '\'' +
                ", drid='" + drid + '\'' +
                ", gs='" + gs + '\'' +
                ", gb='" + gb + '\'' +
                ", es='" + es + '\'' +
                ", gfid='" + gfid + '\'' +
                ", eid='" + eid + '\'' +
                '}';
    }
}
