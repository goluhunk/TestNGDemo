package org.gaurav;

import org.testng.annotations.Test;

public class TestCases {

    @Test
    public void setup(){
        System.out.println("This is setup method");
    }

    @Test
    public void login(){
        System.out.println("This is login method");
    }

    @Test
    public void close(){
        System.out.println("This is close method");
    }
}
