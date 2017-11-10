package me.feathers.sell.enums;

import lombok.Getter;

/**
 * 订单状态
 * <p>
 *
 * @author Feathers
 * @date 2017-11-08 16:41
 */
@Getter
public enum PayStatusEnum {

    /**
     * 未支付
     */
    WAIT(0, "未支付"),
    /**
     * 支付成功
     */
    SUCCESS(1, "支付成功"),
    ;

    private int code;
    private String msg;

    PayStatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
