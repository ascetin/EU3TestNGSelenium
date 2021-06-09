package com.cybertek.tests.day7_testng_typesofelements_1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {

    @Test
    public void test1() {
        Assert.assertEquals("title","tiTle");
        // Bu iki degerin birbirine esit olup olmadigini kontrol ediyor...
        // Dogruysa devamindaki kodlari calistiriyor.. Dogru degilse kesiyor..

    }
    @Test
    public void test2(){
        Assert.assertEquals("test2", "test22", "verify test2");
    }
    @Test
    public void test3(){
        String expectedTitle ="Cyb";
        String actualTitle = "Cybertek";

        Assert.assertTrue(actualTitle.startsWith(expectedTitle), "Verify title starts with Cyb");
    }
    @Test
    public void test4(){
        //verify emalils contains @ sign
        String email = "mike@smith.com";

        Assert.assertTrue(email.contains("@"),"verify email contains @");
    }
    @Test
    public void test5(){
        Assert.assertFalse(0>1,"Verify that 0 is not greater than 1");
    }
    @Test
    public void test6(){
        Assert.assertNotEquals("one","two");
    }

    @BeforeMethod
    public void open() {
        System.out.println("Open Browser");
    }

    @AfterMethod
    public void teardown() {
        System.out.println("Close Browser");
    }
}
