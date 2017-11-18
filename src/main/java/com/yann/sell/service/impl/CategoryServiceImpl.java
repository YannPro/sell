package com.yann.sell.service.impl;

import com.yann.sell.dataobject.ProductCategory;
import com.yann.sell.repository.ProductCategoryRepository;
import com.yann.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YannYao
 * @create 2017-11-18 18:19
 **/
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository repository;

    public ProductCategory findOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }

    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
