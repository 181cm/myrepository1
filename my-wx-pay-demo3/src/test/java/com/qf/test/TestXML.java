package com.qf.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-context*.xml")
public class TestXML {

    @Test
    public void test1(){

        String xml = "<xml><a>hello</a><b>hellob</b></xml>";
        System.out.println(xml.indexOf("<a>"));
        System.out.println(xml.indexOf("</a>"));
        System.out.println(xml.substring(5,13));



    }
}
