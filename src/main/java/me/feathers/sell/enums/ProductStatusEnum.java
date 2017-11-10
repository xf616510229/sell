package me.feathers.sell.enums;

import lombok.Getter;

/**
 * 商品状态
 * <p>
 *
 * @author Feathers
 * @date 2017-11-08 16:38
 */
@Getter
public enum ProductStatusEnum {

    /**
     * 在架
     */
    UP(0, "在架"),
    /**
     * 下架
     */
    DOWN(1, "下架");

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
