package com.yycdev.douyu.sdk.util;

import java.lang.reflect.Array;

/**
 * 数组工具类
 *
 * @author Looly
 *
 */
public class ArrayUtil {

    /**
     * 将新元素添加到已有数组中<br>
     * 添加新元素会生成一个新的数组，不影响原数组
     *
     * @param <T> 数组元素类型
     * @param buffer 已有数组
     * @param newElements 新元素
     * @return 新数组
     */
    @SafeVarargs
    public static <T> T[] append(T[] buffer, T... newElements) {
        if(isEmpty(buffer)) {
            return newElements;
        }
        return insert(buffer, buffer.length, newElements);
    }

    /**
     * 将新元素插入到到已有数组中的某个位置<br>
     * 添加新元素会生成一个新的数组，不影响原数组<br>
     * 如果插入位置为为负数，从原数组从后向前计数，若大于原数组长度，则空白处用null填充
     *
     * @param <T> 数组元素类型
     * @param buffer 已有数组
     * @param index 插入位置，此位置为对应此位置元素之前的空档
     * @param newElements 新元素
     * @return 新数组
     * @since 4.0.8
     */
    @SafeVarargs
    public static <T> T[] insert(T[] buffer, int index, T... newElements) {
        if (isEmpty(newElements)) {
            return buffer;
        }
        if(isEmpty(buffer)) {
            return newElements;
        }
        if (index < 0) {
            index = (index % buffer.length) + buffer.length;
        }

        final T[] result = newArray(buffer.getClass().getComponentType(), Math.max(buffer.length, index) + newElements.length);
        System.arraycopy(buffer, 0, result, 0, Math.min(buffer.length, index));
        System.arraycopy(newElements, 0, result, index, newElements.length);
        if (index < buffer.length) {
            System.arraycopy(buffer, index, result, index + newElements.length, buffer.length - index);
        }
        return result;
    }

    // ---------------------------------------------------------------------- isEmpty
    /**
     * 数组是否为空
     *
     * @param <T> 数组元素类型
     * @param array 数组
     * @return 是否为空
     */
    @SuppressWarnings("unchecked")
    public static <T> boolean isEmpty(final T... array) {
        return array == null || array.length == 0;
    }

    // ---------------------------------------------------------------------- isNotEmpty
    /**
     * 数组是否为非空
     *
     * @param <T> 数组元素类型
     * @param array 数组
     * @return 是否为非空
     */
    @SuppressWarnings("unchecked")
    public static <T> boolean isNotEmpty(final T... array) {
        return (array != null && array.length != 0);
    }


    /**
     * 新建一个空数组
     *
     * @param <T> 数组元素类型
     * @param componentType 元素类型
     * @param newSize 大小
     * @return 空数组
     */
    @SuppressWarnings("unchecked")
    public static <T> T[] newArray(Class<?> componentType, int newSize) {
        return (T[]) Array.newInstance(componentType, newSize);
    }

    /**
     * 新建一个空数组
     *
     * @param <T> 数组元素类型
     * @param newSize 大小
     * @return 空数组
     * @since 3.3.0
     */
    @SuppressWarnings("unchecked")
    public static <T> T[] newArray(int newSize) {
        return (T[]) new Object[newSize];
    }

}
