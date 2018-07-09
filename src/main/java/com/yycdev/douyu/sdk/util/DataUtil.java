package com.yycdev.douyu.sdk.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 功能描述：数据处理工具类
 *
 * @auther: liangjingkun
 * @date: 2018-07-07 16:23:11
 * 修改日志:
 */
public class DataUtil {
    static Pattern nickNamePattern = Pattern.compile("/nn@=(.*?)/");

    static Pattern msgTextPattern = Pattern.compile("/txt@=(.*?)/");

    static Pattern typePattern = Pattern.compile("type@=(.*?)/");

    private static String match(String source, Pattern pattern, int groupId) {
        Matcher matcher = pattern.matcher(source);
        if (matcher.find()) {
            return matcher.group(groupId);
        } else {
            return "";
        }
    }

    public static String getNickName(String source) {
        return match(source, nickNamePattern, 1);
    }

    public static String getMsg(String source) {
        return match(source, msgTextPattern, 1);
    }

    /**
     * 从消息中获取消息类型
     * @param source
     * @return
     */
    public static String getMsgType(String source) {
        return match(source, typePattern, 1);
    }



}
