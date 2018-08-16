package com.service.abc.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestAbc {

        AbcDelegate abcDelegate = new AbcDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = abcDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}