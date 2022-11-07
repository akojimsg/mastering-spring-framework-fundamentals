package com.akojimsg.msff;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {
    /**
     *  suppose it places and order for something ...
     * */
    @Transactional
    public void placeOrder() {
        System.out.println("placing order ...");
    }
}
