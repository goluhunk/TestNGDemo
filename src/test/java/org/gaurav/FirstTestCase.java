package org.gaurav;

import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 1)
    public void setup(){
        System.out.println("This is setup method");
    }

    @Test(priority = 2)
    public void login(){
        System.out.println("This is login method");
    }

    @Test(priority = 3)
    public void close(){
        System.out.println("This is close method");
    }
}
