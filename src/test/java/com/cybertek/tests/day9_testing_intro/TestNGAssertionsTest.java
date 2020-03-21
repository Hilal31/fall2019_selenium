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
        Assert.assertTrue(actual.equals(expected));
       // System.out.println(actual.equals(expected));

        int e=100;
        int a=200;
        Assert.assertTrue(a>e);
    }

    @Test
    public void test5() {

        //verify that url is equal to https://www.google.com/
        String expected = "https://www.google.com/";
        String actual = "https://www.google.com/";
        Assert.assertTrue(actual.equals(expected));
        // System.out.println(actual.equals(expected));

        String expected1 = "java";
        String actual1 = "java-Google Search";
        Assert.assertTrue(actual.equals(expected));


    }

}
