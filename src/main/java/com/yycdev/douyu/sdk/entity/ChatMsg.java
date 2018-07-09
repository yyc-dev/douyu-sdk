package com.yycdev.douyu.sdk.entity;

/**
 * 功能描述：弹幕消息
 *
 * @auther: coffee
 * @date: 2018-07-04 19:44:16
 * 修改日志:
 */
public class ChatMsg implements MsgEntity {
    /**
     * 原消息
     */
    private String message;

    /**
     * 原消息ID
     */
    private String uuid;

    /**
     * 弹幕唯一ID
     */
    private String cid;

    /**
     * 弹幕组ID
     */
    private String gid;

    /**
     * 房间ID
     */
    private String rid;

    /**
     * 发送者 uid
     */
    private String uid;

    /**
     * 用户昵称
     */
    private String nn;

    /**
     * 消息内容
     */
    private String txt;

    /**
     * 用户等级
     */
    private String level;

    /**
     * 礼物头衔：默认值 0（表示没有头衔）
     */
    private String gt;

    /**
     * 消息颜色：默认值 0（表示默认颜色弹幕）
     */
    private String col;

    /**
     * 客户端类型：默认值 0
     */
    private String ct;

    /**
     * 房间权限组：默认值 1（表示普通权限用户）
     */
    private String rg;

    /**
     * 平台权限组：默认值 1（表示普通权限用户）
     */
    private String pg;

    /**
     * 弹幕具体类型: 默认值 0（普通弹幕）
     */
    private String cmt;

    /**
     * 用户头像
     */
    private String ic;

    /**
     * 贵族等级
     */
    private String nl;

    /**
     * 贵族弹幕标识,0-非贵族弹幕,1-贵族弹幕,默认值 0
     */
    private String nc;

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

    /**
     * 主播等级
     */
    private String ol;

    /**
     * 是否反向弹幕标记: 0-普通弹幕，1-反向弹幕, 默认值 0
     */
    private String rev;

    /**
     * 是否高亮弹幕标记: 0-普通，1-高亮, 默认值 0
     */
    private String hl;

    /**
     * 是否粉丝弹幕标记: 0-非粉丝弹幕，1-粉丝弹幕, 默认值 0
     */
    private String ifs;

    /**
     * 弹幕发送时间
     */
    private String cst;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
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

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
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

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
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

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getNl() {
        return nl;
    }

    public void setNl(String nl) {
        this.nl = nl;
    }

    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc;
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

    public String getOl() {
        return ol;
    }

    public void setOl(String ol) {
        this.ol = ol;
    }

    public String getRev() {
        return rev;
    }

    public void setRev(String rev) {
        this.rev = rev;
    }

    public String getHl() {
        return hl;
    }

    public void setHl(String hl) {
        this.hl = hl;
    }

    public String getIfs() {
        return ifs;
    }

    public void setIfs(String ifs) {
        this.ifs = ifs;
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
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
        return "ChatMsg{" +
                "cid='" + cid + '\'' +
                ", gid='" + gid + '\'' +
                ", rid='" + rid + '\'' +
                ", uid='" + uid + '\'' +
                ", nn='" + nn + '\'' +
                ", txt='" + txt + '\'' +
                ", level='" + level + '\'' +
                ", gt='" + gt + '\'' +
                ", col='" + col + '\'' +
                ", ct='" + ct + '\'' +
                ", rg='" + rg + '\'' +
                ", pg='" + pg + '\'' +
                ", cmt='" + cmt + '\'' +
                ", ic='" + ic + '\'' +
                ", nl='" + nl + '\'' +
                ", nc='" + nc + '\'' +
                ", bnn='" + bnn + '\'' +
                ", bl='" + bl + '\'' +
                ", brid='" + brid + '\'' +
                ", hc='" + hc + '\'' +
                ", ol='" + ol + '\'' +
                ", rev='" + rev + '\'' +
                ", hl='" + hl + '\'' +
                ", ifs='" + ifs + '\'' +
                ", cst='" + cst + '\'' +
                '}';
    }

    /**
     * 转换为弹幕消息展示 (name: txt)
     *
     * @return
     */
    public String toChatStr() {
        return String.format("%s: %s", nn, txt);
    }
}
