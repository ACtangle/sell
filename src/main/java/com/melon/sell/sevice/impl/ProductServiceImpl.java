package com.melon.sell.sevice.impl;

import com.melon.sell.enums.ProductStatusEnum;
import com.melon.sell.pojo.ProductInfo;
import com.melon.sell.repository.ProductInfoRepository;
import com.melon.sell.sevice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName ProductServiceImpl
 * Description TODO
 * Author melon
 * Date 2019-07-01 17:01
 * Version
 */

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo findOne(String productId) {
        return repository.findOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }
}
