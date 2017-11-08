package me.feathers.sell.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 订单详情
 * <p>
 *
 * @author Feathers
 * @date 2017-11-08 15:27
 */
@Entity
@Data
public class OrderDetail {

    /** id */
    @Id
    @GeneratedValue
    private String detailId;

    /** 订单id */
    private String orderId;

    /** 产品id */
    private String productId;

    /** 产品名称 */
    private String productName;

    /** 产品价格 */
    private Double productPrice;

    /** 产品数量 */
    private Integer productQuantity;

    /** 产品图片 */
    private String productIcon;
}
