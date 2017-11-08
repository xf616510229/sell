package me.feathers.sell.repository;

import me.feathers.sell.domain.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 产品分类测试
 * <p>
 *
 * @author Feathers
 * @date 2017-11-08 14:45
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findAllTest() {
        List<ProductCategory> all = repository.findAll();
        System.out.println(all);
    }
}