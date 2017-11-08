package me.feathers.sell.service.impl;

import me.feathers.sell.domain.ProductCategory;
import me.feathers.sell.repository.ProductCategoryRepository;
import me.feathers.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类目实现
 * <p>
 *
 * @author Feathers
 * @date 2017-11-08 17:22
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory findOne(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public void save(ProductCategory category) {
        repository.save(category);
    }
}
