package com.coderjd.model;

@lombok.Data
public class Billing {
    public int billingId;
    public double totalTax;
    public double FinalBill;
    public Order orderId;
}