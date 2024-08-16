package org.gaurav;

import org.testng.annotations.*;

public class TestNGAnnotations1 {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This is before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("This is after Suite");
    }
    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("This is before class method");
    }

    @BeforeMethod
    public void setUP(){
        System.out.println("This is before method");
    }
    @Test
    public void testMethod1(){
        System.out.println("This is test method 1");
    }
    @Test
    public void testMethod2(){
        System.out.println("This is test method 2");
    }

    @Test
    public void testMethod3(){
        System.out.println("This is test method 3");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("This is after method");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("This is after class method");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("This is before Test");
    }


    @AfterTest
    public void afterTest(){
        System.out.println("This is after Test");
    }



}
