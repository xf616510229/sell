package me.feathers.sell.repository;

import me.feathers.sell.domain.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 卖家信息
 * <p>
 *
 * @author Feathers
 * @date 2017-11-10 15:24
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {
    
}
