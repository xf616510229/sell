package me.feathers.sell.service.impl;

import me.feathers.sell.domain.ProductInfo;
import me.feathers.sell.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 商品信息Service
 * <p>
 *
 * @author Feathers
 * @date 2017-11-09 11:31
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() throws Exception {
        ProductInfo one = productService.findOne("123456");
        Assert.assertEquals("123456", one.getProductId());
    }

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> upAll = productService.findUpAll();
        Assert.assertNotEquals(0, upAll.size());
    }

    @Test
    public void findAll() throws Exception {
        PageRequest page = new PageRequest(0, 2);
        Page<ProductInfo> all = productService.findAll(page);
        System.out.println(all.getTotalElements());
    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123457");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好喝");
        productInfo.setProductIcon("http://xx.com/xx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(2);

        ProductInfo save = productService.save(productInfo);
        Assert.assertNotNull(save);
    }

}