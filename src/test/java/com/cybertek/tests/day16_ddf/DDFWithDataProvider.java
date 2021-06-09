package com.cybertek.tests.day16_ddf;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFWithDataProvider {

    @DataProvider
    public Object [] [] testData() {

        String [] [] data = {

                {"person of Intrerest", "10"},
                {"Scherlock", "9"},
                {"Breaking Bad", "9"},
                {"The Office", "8"},
                {"Friends", "7"},
                {"Westworld","10"},
                {"Gotham","9"},
                {"Dark","8"},
        };

        return data;
    }

    @Test (dataProvider = "testData")
    public void test1(String tvshow, String rating) {
        System.out.println("tvshow = " + tvshow + "has rating " + rating);
    }

}
