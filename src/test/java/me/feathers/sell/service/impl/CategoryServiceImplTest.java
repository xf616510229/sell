package me.feathers.sell.service.impl;

import me.feathers.sell.domain.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * ${DESCRIPTION}
 * <p>
 *
 * @author Feathers
 * @date 2017-11-08 18:29
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() throws Exception {
        ProductCategory one = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1), one.getCategoryId());
    }

    @Test
    public void findAll() throws Exception {
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
    }

    @Test
    public void save() throws Exception {
    }

}