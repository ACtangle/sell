package com.melon.sell.repository;

import com.melon.sell.pojo.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    private final String OPEN_ID="110110110";

    @Test
    public void findByBuyerOpenidTest() throws Exception{
        PageRequest pageRequest = new PageRequest(0,3);
        Page<OrderMaster> result = repository.findByBuyerOpenid(OPEN_ID,pageRequest);
        Assert.assertNotEquals(0, result.getTotalElements());
    }


    @Test
    public void saveTest() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("师姐");
        orderMaster.setBuyerPhone("18826237415");
        orderMaster.setBuyerAddress("广州市黄埔区");
        orderMaster.setBuyerOpenid("1151161878");
        orderMaster.setOrderAmount(new BigDecimal(2.3));

        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);
    }
}