package com.service.testsource.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTestsource {

        TestsourceDelegate testsourceDelegate = new TestsourceDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = testsourceDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}