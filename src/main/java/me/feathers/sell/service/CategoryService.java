package me.feathers.sell.service;

import me.feathers.sell.domain.ProductCategory;

import java.util.List;

/**
 * 类目
 * <p>
 *
 * @author Feathers
 * @date 2017-11-08 17:18
 */
public interface CategoryService {

    /**
     * 根据id查询指定类目
     *
     * @param id id
     * @return 类目
     */
    ProductCategory findOne(Integer id);

    /**
     * 查询所有类目
     *
     * @return 所有类目
     */
    List<ProductCategory> findAll();

    /**
     * 根据多个id查询多个类目
     *
     * @param categoryTypeList 类目ids
     * @return 多个类目
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 添加一个类目
     *
     * @param category 目标类目
     */
    void save(ProductCategory category);
}
