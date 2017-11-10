package me.feathers.sell.repository;

import me.feathers.sell.SellTest;
import me.feathers.sell.domain.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 产品分类测试
 * <p>
 *
 * @author Feathers
 * @date 2017-11-08 14:45
 */
public class ProductCategoryRepositoryTest extends SellTest{
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void saveTest() {
        ProductCategory category = new ProductCategory();
        category.setCategoryType(2);
        category.setCategoryName("测试");
        ProductCategory save = repository.save(category);
        Assert.assertNotNull(save.getCategoryId());
    }

    @Test
    public void findAllTest() {
        List<ProductCategory> all = repository.findAll();
        System.out.println(all);
    }
}