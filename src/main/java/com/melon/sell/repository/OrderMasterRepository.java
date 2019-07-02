package com.melon.sell.repository;

import com.melon.sell.pojo.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ClassName OrderMasterRepository
 * Description
 * Author melon
 * Date 2019-07-02 01:08
 * Version
 */

public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {

    Page<OrderMaster> findByBuyerOpenid(String buyerOpennid, Pageable pageable);
}
