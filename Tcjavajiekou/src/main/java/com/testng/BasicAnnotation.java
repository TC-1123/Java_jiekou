package com.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase01(){
        System.out.println("testNG001");
    }

    @Test
    public void testCase02(){
        System.out.println("testNG002");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法前运行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在测试方法最后运行的");
    }

    @BeforeClass
    public void brforeClass(){
        System.out.println("brforeClass这是在类运行之前运行");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是在类运行完后运行的");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }
}
