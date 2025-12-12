package com.coderjd.controller;

import com.coderjd.model.OrderDelivery;
import com.coderjd.service.OrderDeliveryService;

public class OrderDeliveryController {
    private OrderDeliveryService orderDeliveryService = new OrderDeliveryService();

    public OrderDelivery orderDeliverPackage() {
        System.out.println("-------Order Delivery Status-------");
        orderDeliveryService.orderDeliveryStatus();
        return null;
    }
}
