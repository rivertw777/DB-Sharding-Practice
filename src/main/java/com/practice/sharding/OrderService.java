package com.practice.sharding;

import java.util.List;
import java.util.Random;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class OrderService {

    private static final String[] PRODUCT_NAMES = {"신발", "모자", "티셔츠", "바지"};
    private static final Random RANDOM = new Random();

    private final OrderRepository orderRepository;

    @Transactional
    public Order createOrder() {
        Order order = new Order(PRODUCT_NAMES[RANDOM.nextInt(PRODUCT_NAMES.length)]);
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
