package com.melon.sell.sevice;

import com.melon.sell.pojo.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * ClassName ProductService
 * Description TODO
 * Author melon
 * Date 2019-07-01 16:58
 * Version
 */

public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有上架商品
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 后台查询所有商品
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //TODO：加库存

    //TODO：减库存
}
