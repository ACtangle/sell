package com.melon.sell.repository;

import com.melon.sell.pojo.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * ClassName ProductInfoRepository
 * Description TODO
 * Author melon
 * Date 2019-07-01 16:42
 * Version
 */

public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
