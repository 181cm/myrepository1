package com.qf.test;


import com.qf.entity.TProduct;
import com.qf.service.IProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-context*.xml")
public class TestProduct {

    @Autowired
    IProductService productService;


    @Test
    public void testAddProduct(){
        TProduct product = new TProduct();
        product.setPid(10011L);
        product.setPname("HUAWEI P30");
        product.setPrice(6777L);

        productService.addProduct(product);
    }

}
