package com.coderjd.service;

import com.coderjd.controller.OrderDeliveryController;
import com.coderjd.model.Billing;
import com.coderjd.model.DeliveryAgent;
import com.coderjd.model.Order;
import com.coderjd.model.OrderDelivery;

import java.util.Scanner;

public class OrderDeliveryService {
    // DA name
    // Order id
    //Billing id//
    //total bill
    //customer name
    //customer address
    //customer mobile no
    //restaurant name and address
    //bill status
    // order delivery status
    // delivery time;
    private Scanner scanner = new Scanner(System.in);
    OrderService orderService = new OrderService();

    public OrderDelivery orderDeliveryStatus() {

        System.out.println("Enter order id ");
        int orderDeliveryId = Integer.parseInt(scanner.nextLine());

        //check contains the id and then print it
        try {
            if (orderService.checkOrder()) {
                System.out.println("Order received and will get delivered soon of Id: " + orderDeliveryId);
            } else {
                System.out.println("Order not found");
            }
        } catch (Exception e) {
            System.err.println("Order not found");
        }
        return orderDeliveryStatus();
    }
}