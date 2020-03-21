package com.cybertek.tests.day9_testing_intro;

import org.testng.Assert;
import org.testng.annotations.*;

public class BeforeAndAfterTest {
    @BeforeClass
    public void beforeClass(){
        System.out.println("\nBefore Classss");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("\nAfter Classs");
    }

    @BeforeMethod//never call other place and iy is running beginning of each normal test like sandwich
    //used for set variable, opening browser,
    public void beforeMethod(){
        System.out.println("\tBefore Method");
    }

    @AfterMethod//execute after each method in that class.it is executed even if the test fails.
    //used for reporting,closing connection,closing
    public void afterMethod(){
        System.out.println("\nAfter method");
        Assert.assertEquals(true,true);
    }

    @Test
    public void test1(){
        System.out.println("test 1");
    }


    @BeforeMethod//never call other place
    public void beforeMethod2(){
        System.out.println("\tBefore Method 2");
    }

    @Test
    public void test2(){
    System.out.println("test 22");
}


}
