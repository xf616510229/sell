package me.feathers.sell.repository;

import me.feathers.sell.domain.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 订单(主)
 * <p>
 *
 * @author Feathers
 * @date 2017-11-10 9:18
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

    /**
     * 根据买家openid查询买家订单
     * @param buyerOpenid openid
     * @param pageable 分页对象
     * @return 所有订单
     */
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);

}