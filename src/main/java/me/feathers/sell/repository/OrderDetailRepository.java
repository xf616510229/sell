package me.feathers.sell.repository;

import me.feathers.sell.domain.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 订单详情(从)
 * <p>
 *
 * @author Feathers
 * @date 2017-11-10 9:25
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    /**
     * 根据订单id查询订单详情
     * @param orderId 订单id
     * @return 订单详情
     */
    List<OrderDetail> findByOrderId(String orderId);

}
