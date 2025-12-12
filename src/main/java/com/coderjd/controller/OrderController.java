package com.coderjd.controller;

import com.coderjd.model.Order;
import com.coderjd.service.OrderService;

import java.util.Scanner;

public class OrderController {
    private Scanner scanner = new Scanner(System.in);
    private OrderService orderService = new OrderService();


    public Order ordercontrollerPackage() {
        System.out.println("-----------Order Food Section-----------");
        System.out.println("501. create new Order");
        System.out.println("502. cancel Order");
        System.out.println("503. Display Order details using Order ID");
        System.out.println("000. EXIT\n");

        int optionOrder = 0;

        do {
            System.out.println("Please enter option in given DIGIT CODE ONLY");
            optionOrder = Integer.parseInt(scanner.nextLine());

            switch (optionOrder) {
                case 201:
                    orderService.createOrder();
                    break;
                case 202:
                    orderService.cancelOrder();
                    break;
                case 203:
                    orderService.displayOrder();
                    break;
                case 204:
                    orderService.displayAllOrder();
                    break;
                default:
                    System.out.println("invalid option entered");
                    break;
            }
        }
        while (optionOrder != 000);
        return null;
    }
}
