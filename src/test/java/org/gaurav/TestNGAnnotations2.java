package org.gaurav;

import org.testng.annotations.*;

public class TestNGAnnotations2 {
    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("This is before class method");
    }

    @BeforeMethod
    public void setUP(){
        System.out.println("This is before method");
    }
    @Test
    public void testMethod4(){
        System.out.println("This is test method 4");
    }
    @Test
    public void testMethod5(){
        System.out.println("This is test method 5");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("This is after method");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("This is after class method");
    }



}
