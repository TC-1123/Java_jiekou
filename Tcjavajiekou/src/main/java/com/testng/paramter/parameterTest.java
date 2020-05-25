package com.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterTest {

    @Test
    @Parameters({"name","age"})
    public void paramterTest01(String name,int age){
        System.out.println("name="+name+"age = "+age);
    }
}
