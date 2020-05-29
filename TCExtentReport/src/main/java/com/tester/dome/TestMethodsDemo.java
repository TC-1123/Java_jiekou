package com.tester.dome;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

//测试方法类
public class TestMethodsDemo {

    @Test
    public void test01(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void test02(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test03(){
        Assert.assertEquals("aaa","aaa");
    }

    @Test
    public void logDome(){
        Reporter.log("这是我们自己写的日志");
        throw new RuntimeException("这是我自己抛出的异常");
    }


}
