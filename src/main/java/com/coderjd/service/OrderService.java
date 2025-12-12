package com.coderjd.service;

import com.coderjd.model.Order;
import com.coderjd.model.OrderDelivery;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class OrderService {

    private Scanner scanner = new Scanner(System.in);
    private List<Order> orderList = new LinkedList<>();
    OrderDelivery orderDelivery = new OrderDelivery();

    public Order createOrder() {

        Order order = new Order();
        System.out.println("Enter order id ");
        order.setOrderId(Integer.parseInt(scanner.nextLine()));

        System.out.println("enter list of items and quantity");
        order.setOrderList(scanner.nextLine());

        System.out.println("Enter total price of items in Rupees");
        order.setTotalPrice(scanner.nextDouble());

        System.out.println("Enter the mode of payment - UPI,Card,Cash On Delivery");
        order.setPaymentMethod(scanner.nextLine());

        System.out.println(" Enter delivery time");
        order.setDeliveryTime(scanner.nextLine());
        return order;

    }

    public Order cancelOrder() {
        int cancelOrder;
        System.out.println("Enter order id ");
        cancelOrder = Integer.parseInt(scanner.next());
        try {
            orderList.contains(cancelOrder);
            System.out.println("order " + cancelOrder + " has been deleted ");
            orderList.remove(cancelOrder);
        } catch (Exception e) {
            System.err.println("order not found ");
        }
        return cancelOrder();
    }

    public Order displayOrder() {
        System.out.println("Enter order id ");
        String tryid = scanner.next();
        if (tryid.isEmpty()) {
            System.out.println("Enter valid order id ");
        } else {
            try {
                int displayOrderId = Integer.parseInt(tryid);
                if (orderList.contains(displayOrderId)) {
                    System.out.println("Customer details : " + orderList.get(displayOrderId));
                }
            } catch (NumberFormatException e) {
                System.err.println(" Enter the order id in digits only" + e.getMessage());
            }
        }
        return displayOrder();
    }

    public Order displayAllOrder() {
        for (Order order : orderList) {
            System.out.println("Displaying all the orders" + order);
        }
        return displayOrder();
    }
    public boolean checkOrder() {
        if (orderList.contains(orderDelivery.getOrderDeliveryId())) {
            System.out.println("Order id verified");

        }else{
            System.out.println("Order id not available");
        }
        return checkOrder();
    }
    }