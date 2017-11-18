package com.yann.sell.service;

import com.yann.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @author
 * @create 2017-11-18 18:12
 **/
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    /**
     *根据categoryType数组查找符合条件的所有的ProductCategory实体
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
