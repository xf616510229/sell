package me.feathers.sell.repository;

import me.feathers.sell.domain.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品信息
 * <p>
 *
 * @author Feathers
 * @date 2017-11-09 10:56
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    /**
     * 根据商品状态查询商品信息
     * @param productStatus 商品状态
     * @return 查询结果
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
