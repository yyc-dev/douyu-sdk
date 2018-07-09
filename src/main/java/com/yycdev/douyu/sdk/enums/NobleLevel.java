package com.yycdev.douyu.sdk.enums;

/**
 * 功能描述：贵族等级
 *
 * @auther: liangjingkun
 * @date: 2018-07-08 23:38:22
 * 修改日志:
 */
public enum NobleLevel {
    LEVEL_0("0", "游侠"),
    LEVEL_1("1", "骑士"),
    LEVEL_2("2", "子爵"),
    LEVEL_3("3", "伯爵"),
    LEVEL_4("4", "公爵"),
    LEVEL_5("5", "国外"),
    LEVEL_6("6", "皇帝"),;

    NobleLevel(String code, String description) {
        this.code = code;
        this.description = description;
    }

    private String code;
    private String description;
}
