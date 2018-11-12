package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void testGroups1(){
        System.out.println("这是服务端的测试1");
    }
    @Test(groups = "server")
    public void testGroups2(){
        System.out.println("这是服务端的测试2");
    }
    @Test(groups = "client")
    public void testGroups3(){
        System.out.println("这是客户端的测试3");
    }
    @Test(groups = "client")
    public void testGroups4(){
        System.out.println("这是客户端的测试4");
    }
    @BeforeGroups("server")
    public void beforeGroup(){
        System.out.println("这是运行组之前的方法");
    }
    @AfterGroups("server")
    public void afterGroup(){
        System.out.println("这是运行组之后的方法");
    }
    @BeforeGroups("client")
    public void beforeClientGroup(){
        System.out.println("这是运行组之前的方法");
    }
    @AfterGroups("client")
    public void afterClientGroup(){
        System.out.println("这是运行组之后的方法");
    }

}
