package com.cybertek.tests.day3_locator2;

import com.github.javafaker.Faker;

public class FakerPractice {
    public static void main(String[] args) {
        //create faker obj
        Faker fakeData=new Faker();
        //i need 1st name
        String name=fakeData.name().firstName();
        System.out.println(name);
    }
}
