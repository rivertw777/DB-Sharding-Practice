package com.practice.sharding;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ShardingTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testSharding() {
        for (int i = 0; i < 1000; i++) {
            orderService.createOrder();
        }
    }

}