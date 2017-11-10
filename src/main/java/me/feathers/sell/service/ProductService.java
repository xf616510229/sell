package me.feathers.sell.service;

import me.feathers.sell.domain.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品信息
 * <p>
 *
 * @author Feathers
 * @date 2017-11-09 11:16
 */
public interface ProductService {

    /**
     * 根据id查询商品信息
     *
     * @param productId id
     * @return 商品信息
     */
    ProductInfo findOne(String productId);

    /**
     * 查询所有商家商品
     *
     * @return 查询结果
     */
    List<ProductInfo> findUpAll();

    /**
     * 分页查询所有商品信息
     *
     * @param pageable 分页信息
     * @return 查询结果
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 保存一个商品信息
     *
     * @param productInfo 商品信息
     * @return 商品信息返回
     */
    ProductInfo save(ProductInfo productInfo);


}
