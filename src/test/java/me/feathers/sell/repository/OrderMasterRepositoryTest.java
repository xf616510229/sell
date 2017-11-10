package me.feathers.sell.repository;

import me.feathers.sell.SellTest;
import me.feathers.sell.domain.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.math.BigDecimal;

/**
 * 订单(主)
 * <p>
 *
 * @author Feathers
 * @date 2017-11-10 9:28
 */
public class OrderMasterRepositoryTest extends SellTest {

    @Autowired
    private OrderMasterRepository repository;

    @Test
    public void saveTest() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123344");
        orderMaster.setBuyerName("小二");
        orderMaster.setBuyerPhone("12345678901");
        orderMaster.setBuyerAddress("越来客栈");
        orderMaster.setBuyerOpenid("110110");
        orderMaster.setOrderAmount(new BigDecimal(2.3));
        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByBuyerOpenid() throws Exception {
        Page<OrderMaster> all = repository.findByBuyerOpenid("12345678", new PageRequest(1, 2));
        System.out.println(all.getTotalElements());
    }

}