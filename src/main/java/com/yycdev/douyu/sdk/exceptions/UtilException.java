package com.yycdev.douyu.sdk.exceptions;

/**
 * 工具类异常
 *
 * @author coffee
 */
public class UtilException extends RuntimeException {
    private static final long serialVersionUID = 8247610319171014183L;

    public UtilException(Throwable e) {
        super(UtilException.getMessage(e), e);
    }

    public UtilException(String message) {
        super(message);
    }

    public UtilException(String messageTemplate, Object... params) {
        super(String.format(messageTemplate, params));
    }

    public UtilException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public UtilException(Throwable throwable, String messageTemplate, Object... params) {
        super(String.format(messageTemplate, params), throwable);
    }

    /**
     * 获得完整消息，包括异常名
     *
     * @param e 异常
     * @return 完整消息
     */
    public static String getMessage(Throwable e) {
        if (null == e) {
            return "null";
        }
        return String.format("{}: {}", e.getClass().getSimpleName(), e.getMessage());
    }
}
