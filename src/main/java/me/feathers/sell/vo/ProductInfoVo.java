package me.feathers.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import me.feathers.sell.domain.ProductInfo;

import java.math.BigDecimal;
import java.util.List;

/**
 * 商品详情
 * <p>
 *
 * @author Feathers
 * @date 2017-11-09 12:38
 */
@Data
public class ProductInfoVo {

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
