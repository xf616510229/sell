package me.feathers.sell.enums;

import lombok.Getter;

/**
 * 返回码信息
 * <p>
 *
 * @author Feathers
 * @date 2017-11-09 14:11
 */
@Getter
public enum ResultEnum {
    /**
     * 服务器内部错误
     */
    UNKNOW_ERROR(-1, "未知错误"),
    /**
     * 请求成功
     */
    SUCCESS(0, "请求成功"),
    ;

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 状态信息
     */
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
