package com.yycdev.douyu.sdk.util;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述: 斗鱼通讯序列化工具<br>
 * 协议版本: 1.62<br>
 * <p>
 * 为增强兼容性、可读性斗鱼后台通讯协议采用文本形式的明文数据。同时针
 * 对本平台数据特点，斗鱼自创序列化、反序列化算法。即 STT 序列化。下面详
 * 细介绍 STT 序列化和反序列化。STT 序列化支持键值对类型、数组类型。规定<br>
 * 如下：<br>
 * 1. 键 key 和值 value 直接采用‘@=’分割<br>
 * 2. 数组采用‘/’分割<br>
 * 3. 如果 key 或者 value 中含有字符‘/’，则使用‘@S’转义<br>
 * 4. 如果 key 或者 value 中含有字符‘@’，使用‘@A’转义<br>
 *
 * @auther: coffee
 * @date: 2018-07-08 18:18:50
 * 修改日志:
 */
public class STTUtil {

    /**
     * STT字符串转换为Map
     *
     * @param sttString
     * @return
     */
    public static Map<String, Object> toMap(String sttString) {
        Map<String, Object> map = new HashMap<>();

        String[] arrays = sttString.split("/");
        for (String s : arrays) {
            if (s == null || "".equals(s)) {
                continue;
            }
            String[] kvArrays = s.split("@=");
            String key = kvArrays[0];
            String value = null;
            if (kvArrays.length > 1) {
                value = kvArrays[1];
            }
            key = decrypt(key);                 //对key中的特殊字符解码
            value = decrypt(decrypt(value));    //对value中的特殊字符解码(目前最多2次解码)
            map.put(key, value);
        }
        return map;
    }

    /**
     * STT字符串转换为bean
     *
     * @param sttString
     * @param beanClass
     * @param <T>
     * @return
     */
    public static <T> T toBean(String sttString, Class<T> beanClass) {
        T obj = ReflectUtil.newInstance(beanClass);
        Map<String, Object> dataMap = toMap(sttString);
        Field[] fields = ReflectUtil.getFields(beanClass);
        for (Field field : fields) {
            String fieldName = field.getName();
            Object value = dataMap.get(fieldName);
            ReflectUtil.setFieldValue(obj, field, value);
        }
        return obj;
    }

    /**
     * 解码key或value中的转码字符<br>
     * 如果给定的值为空，返回null<br>
     * (如果 key 或者 value 中含有字符‘/’，则使用‘@S’转义)<br>
     * (如果 key 或者 value 中含有字符‘@’，使用‘@A’转义)<br>
     *
     * @param str
     * @return
     */
    public static String decrypt(String str) {
        if (str == null) {
            return str;
        }
        if (str.indexOf("@S") > -1 || str.indexOf("@A") > -1) {
            str = str.replaceAll("@S", "/");
            str = str.replaceAll("@A", "@");
        }
        return str;
    }

    public static void main(String[] args) {
        String msg = "type@=loginres/userid@=0/roomgroup@=0/pg@=0/sessionid@=0/username@=/nickname@=/live_stat@=0/is_illegal@=0/ill_ct@=/ill_ts@=0/now@=0/ps@=0/es@=0/it@=0/its@=0/npv@=0/best_dlev@=0/cur_lev@=0/nrc@=0/ih@=0/sid@=72983/sahf@=0/sceneid@=0/";

        msg = "type@=uenter/rid@=4835718/uid@=20003668/nn@=须予银鞍绣毂迎倾心人/level@=39/rg@=4/ic@=avatar_v3@S201807@S79596c14f4a7b4dd245d7a0a33f63ca5/nl@=3/rni@=0/el@=eid@AA=1500000113@ASetp@AA=1@ASsc@AA=1@ASef@AA=0@AS@S/sahf@=0/wgei@=0/cbid@=11011/fl@=18/";

        Map<String, Object> dataMap = STTUtil.toMap(msg);
        for (String key : dataMap.keySet()) {
            System.out.println("key:" + key + "  val:" + dataMap.get(key));
        }

        System.out.println(decrypt("eid@AA=1500000113@ASetp@AA=1@ASsc@AA=1@ASef@AA=0@AS@S"));
    }


}
