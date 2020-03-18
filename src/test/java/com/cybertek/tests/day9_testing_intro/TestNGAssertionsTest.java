package com.cybertek.tests.day9_testing_intro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsTest {

    @Test
    public void test1() {
        String expected = "one";
        String actual = "one";

        Assert.assertEquals(actual, expected);
        Assert.assertEquals(1, 1);
        Assert.assertEquals(false, false);
        //it should be same type like same number, boolean

        System.out.println("test1 completed");


    }

    @Test
    public void test2() {
        String expected = "one";
        String actual = "two";

//        if(expected.equals(actual)){
//            System.out.println("pass");
//        } we can make it with assertEquals..
        System.out.println("comparison 2 starting");
        Assert.assertEquals(actual, expected);

        System.out.println("test 2 completed");
    }

    @Test
    public void test3() {
        String expected = "one";
        String actual = "two";
        Assert.assertNotEquals(expected,actual);
    }

    @Test
    public void test4() {
        String expected = "one";
        String actual = "two";
        Assert.assertNotEquals(expected,actual);
    }

}
