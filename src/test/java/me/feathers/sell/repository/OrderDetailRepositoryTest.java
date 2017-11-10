package me.feathers.sell.repository;

import me.feathers.sell.SellTest;
import me.feathers.sell.domain.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 订单详情
 * <p>
 *
 * @author Feathers
 * @date 2017-11-10 14:47
 */
public class OrderDetailRepositoryTest extends SellTest{

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void save() {
        OrderDetail detail = new OrderDetail();
        detail.setDetailId("123456");
        detail.setOrderId("123456");
        detail.setProductIcon("http://sss.xx");
        detail.setProductId("123456");
        detail.setProductName("大白菜");
        detail.setProductPrice(17.0);
        detail.setProductQuantity(100);
        OrderDetail save = repository.save(detail);
        Assert.assertNotNull(save);
    }

    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> byOrderId = repository.findByOrderId("112330");
        Assert.assertNotNull(byOrderId);
    }

}