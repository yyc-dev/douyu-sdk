package com.yycdev.douyu.sdk.entity;

/**
 * 功能描述：房间内用户抢红包消息
 *
 * @auther: liangjingkun
 * @date: 2018-07-09 11:36:12
 * 修改日志:
 *
 */
public class GgbbMsg implements MsgEntity{
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
     * 抢到的鱼丸数量
     */
    private String sl;

    /**
     * 礼包产生者 id
     */
    private String sid;

    /**
     * 抢礼包者 id
     */
    private String did;

    /**
     * 礼包产生者昵称
     */
    private String snk;

    /**
     * 抢礼包者昵称
     */
    private String dnk;

    /**
     * 礼包类型
     */
    private String rpt;

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

    public String getSl() {
        return sl;
    }

    public void setSl(String sl) {
        this.sl = sl;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getSnk() {
        return snk;
    }

    public void setSnk(String snk) {
        this.snk = snk;
    }

    public String getDnk() {
        return dnk;
    }

    public void setDnk(String dnk) {
        this.dnk = dnk;
    }

    public String getRpt() {
        return rpt;
    }

    public void setRpt(String rpt) {
        this.rpt = rpt;
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
        return "GgbbMsg{" +
                "rid='" + rid + '\'' +
                ", gid='" + gid + '\'' +
                ", sl='" + sl + '\'' +
                ", sid='" + sid + '\'' +
                ", did='" + did + '\'' +
                ", snk='" + snk + '\'' +
                ", dnk='" + dnk + '\'' +
                ", rpt='" + rpt + '\'' +
                '}';
    }


}
