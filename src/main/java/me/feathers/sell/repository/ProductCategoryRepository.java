package me.feathers.sell.repository;

import me.feathers.sell.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 产品类别jpa
 * <p>
 *
 * @author Feathers
 * @date 2017-11-08 14:45
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    /**
     * 根据category的id查询category
     * @param categoryTypeList category id
     * @return category
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
