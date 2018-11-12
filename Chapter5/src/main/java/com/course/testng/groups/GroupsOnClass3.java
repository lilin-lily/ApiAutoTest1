package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "tea")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("这是GroupsOnClass3的teacher1方法");
    }
    public void teacher2(){
        System.out.println("这是GroupsOnClass3的teacher3方法");
    }
}
