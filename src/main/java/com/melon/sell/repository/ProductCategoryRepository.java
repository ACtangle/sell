package com.melon.sell.repository;

import com.melon.sell.pojo.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * ClassName ProductCategoryRepository
 * Description
 * Author melon
 * Date 2019-07-01 15:35
 * Version
 */

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
