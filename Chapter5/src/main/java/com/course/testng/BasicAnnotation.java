package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是注解1");

    }
    @Test
    public void testCase2(){
        System.out.println("这是注解2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是测试方法之前运行的");

    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("这是测试方法之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass是类运行之前的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass是类运行之后的方法");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite套件");

    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite套件");

    }

}
