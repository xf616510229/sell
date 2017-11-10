package me.feathers.sell.repository;

import me.feathers.sell.SellTest;
import me.feathers.sell.domain.SellerInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 卖家信息
 * <p>
 *
 * @author Feathers
 * @date 2017-11-10 15:26
 */
public class SellerInfoRepositoryTest extends SellTest{

    @Autowired
    private SellerInfoRepository repository;

    @Test
    public void save() {
        SellerInfo sellerInfo = new SellerInfo();
        sellerInfo.setId("124342");
        sellerInfo.setOpenid("12253453");
        sellerInfo.setPassword("23532312");
        sellerInfo.setUsername("3215234");
        sellerInfo.setSellerId("1324232");
        SellerInfo save = repository.save(sellerInfo);
        Assert.assertNotNull(save);
    }

}