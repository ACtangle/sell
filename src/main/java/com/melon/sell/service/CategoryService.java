package com.melon.sell.service;

import com.melon.sell.pojo.ProductCategory;

import java.util.List;

/**
 * ClassName CategoryService
 * Description
 * Author melon
 * Date 2019-07-01 16:23
 * Version
 */

public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
