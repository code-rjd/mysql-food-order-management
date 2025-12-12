package com.coderjd.model;

@lombok.Data
public class Order {
    public int orderId;            // order id
    public String deliveryTime;          //delivery time
    // Customer id , delivery agent, delivery address will be called from other class
    public Customer customerID;
    public Customer customerAddress;
    public DeliveryAgent deliveryAgentFirstName;
    public String orderList;
    public double totalPrice;
    public String paymentMethod;
}