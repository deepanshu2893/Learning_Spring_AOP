package com.deepanshuPanwar.learnspringaop.aopexample.business;

import com.deepanshuPanwar.learnspringaop.aopexample.data.DataService1;

import java.util.Arrays;


public class BusinessService1 {

    private DataService1 dataService;



    public int calculateMax() {
        int[] data = dataService.retrievingData();
        return Arrays.stream(data).max().orElse(0);
    }

    // Business Logic
}
