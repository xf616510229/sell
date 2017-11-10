package me.feathers.sell.repository;

import me.feathers.sell.SellTest;
import me.feathers.sell.domain.ProductInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * 商品信息测试
 * <p>
 *
 * @author Feathers
 * @date 2017-11-09 10:59
 */
public class ProductInfoRepositoryTest extends SellTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好喝");
        productInfo.setProductIcon("http://xx.com/xx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);

        repository.save(productInfo);
    }

}