package com.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataprovider(String name,int age){
        System.out.println("name= "+name+";age = " +age);
    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"wangwu",20},
                {"lisi",30},

        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1  name= "+name+";age = " +age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2  name= "+name+";age = " +age);
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] o = null;
        if(method.getName().equals("test1")){
            o = new Object[][]{
                    {"zhangsan",10},
                    {"zhangsan2",20}
            };
        }else if(method.getName().equals("test2")){
            o = new Object[][]{
                    {"lisi",30},
                    {"lisi2",40}
            };
        }
        return o;
    }
}
