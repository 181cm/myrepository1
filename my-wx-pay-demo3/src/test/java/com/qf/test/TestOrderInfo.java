package com.qf.test;


import com.qf.entity.TOrderinfo;
import com.qf.service.IOrderInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-context*.xml")
public class TestOrderInfo {

    @Autowired
    private IOrderInfoService orderInfoService;

    @Test
    public void test1(){
        List<TOrderinfo> orderInfosByOrderId = orderInfoService.getOrderInfosByOrderId(20190708142148L);
        System.out.println(orderInfosByOrderId);

    }
}
