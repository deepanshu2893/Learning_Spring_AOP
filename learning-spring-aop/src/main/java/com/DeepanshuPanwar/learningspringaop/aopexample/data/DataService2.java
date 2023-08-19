package com.DeepanshuPanwar.learningspringaop.aopexample.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService2 {

    public int [] retrieveData() {

        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return new int[]{111, 222, 333, 444, 555};

    }


}
