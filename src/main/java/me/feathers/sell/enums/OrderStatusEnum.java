package me.feathers.sell.enums;

import lombok.Getter;

/**
 * ${DESCRIPTION}
 * <p>
 *
 * @author Feathers
 * @date 2017-11-08 16:38
 */
@Getter
public enum OrderStatusEnum {

    /**
     * 新订单
     */
    NEW(0, "新订单"),
    /**
     * 订单已完成
     */
    FINISH(1, "订单完成"),
    /**
     * 订单已取消
     */
    CANCEL(2, "订单取消"),
    ;

    private int code;
    private String msg;

    OrderStatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
