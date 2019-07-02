package com.melon.sell.repository;

import com.melon.sell.pojo.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * ClassName OrderDetailRepository
 * Description TODO
 * Author melon
 * Date 2019-07-02 01:10
 * Version
 */

public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {

    List<OrderDetail> findByOrderId(String orderId);

}
