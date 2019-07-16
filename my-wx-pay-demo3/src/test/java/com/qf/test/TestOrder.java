package com.qf.test;

import com.qf.common.util.MyUtil;
import com.qf.entity.TOrder;
import com.qf.entity.TProduct;
import com.qf.entity.vo.OrderVO;
import com.qf.service.IOrderService;
import com.qf.service.IProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-context*.xml")
public class TestOrder {

    @Autowired
    private IOrderService orderService;


    @Autowired
    private IProductService productService;


    @Test
    public void testGetOrder(){

        orderService.getList(20090704001L);


    }

    @Test
    public void testStr(){
        String str = "<xml><appid><![CDATA[wx632c8f211f8122c6]]></appid>\n" +
                "<bank_type><![CDATA[GDB_CREDIT]]></bank_type>\n" +
                "<cash_fee><![CDATA[1]]></cash_fee>\n" +
                "<fee_type><![CDATA[CNY]]></fee_type>\n" +
                "<is_subscribe><![CDATA[N]]></is_subscribe>\n" +
                "<mch_id><![CDATA[1497984412]]></mch_id>\n" +
                "<nonce_str><![CDATA[WAPsIAlxDqESQ98u3zOcK2hNgf1m2QCw]]></nonce_str>\n" +
                "<openid><![CDATA[oUuptwrBk_MBBe14getRqhO8h6H0]]></openid>\n" +
                "<orderId><![CDATA[201907090902592011]]></orderId>\n" +
                "<out_trade_no><![CDATA[201907090902592011]]></out_trade_no>\n" +
                "<result_code><![CDATA[SUCCESS]]></result_code>\n" +
                "<return_code><![CDATA[SUCCESS]]></return_code>\n" +
                "<sign><![CDATA[07AC72A4AC608EEAD91DC4BDA028358B262FFB3C2465C8E9AF53BD25F608BC7B]]></sign>\n" +
                "<time_end><![CDATA[20190709095920]]></time_end>\n" +
                "<total_fee>1</total_fee>\n" +
                "<trade_type><![CDATA[NATIVE]]></trade_type>\n" +
                "<transaction_id><![CDATA[4200000341201907091993148176]]></transaction_id>\n" +
                "</xml>";

        int count = "<out_trade_no><![CDATA[".length();
        int begin = str.indexOf("<out_trade_no><![CDATA[");
        int end = str.indexOf("]]></out_trade_no>");
        String substring = str.substring(begin+count, end);
        System.out.println(substring);
    }






    @Test
    public void addOrder(){
        //需要编写数据
        OrderVO orderVO = new OrderVO();
        TOrder tOrder = new TOrder();
        tOrder.setUserId(1L);
        tOrder.setOrderPrice(998877L);
        tOrder.setOrderFlag((short)0);
        tOrder.setOrderId(Long.parseLong(MyUtil.getCurrentTime()));
        tOrder.setOrderAddr("杭州旺田大酒店");
        tOrder.setOrderTel("18888887878");
        tOrder.setOrderUser("李旸");
        tOrder.setCreatedTime(new Date());
        tOrder.setUpdatedTime(new Date());
        orderVO.settOrder(tOrder);

        //========


        List<TProduct> products = productService.getProducts();


        orderVO.setProducts(products);

        //=====orderVO封装完毕===

        //调用service插入数据

        orderService.addOrder(orderVO);


    }

}
