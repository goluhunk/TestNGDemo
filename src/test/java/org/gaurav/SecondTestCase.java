package org.gaurav;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
    public void testMethod1(){
        System.out.println("This is test method 1");
    }

    @Test(priority = 2)
    public void testMethod2(){
        System.out.println("This is test method 2");
        Assert.assertEquals(1,1);
    }

    @Test(priority = 3)
    public void testMethod3(){
        System.out.println("This is test method 3");
    }

}
