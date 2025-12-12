package com.coderjd.model;

    @lombok.Data
    public class Customer {

        int customerId;           //id
        String customerFName;     //first name
        String customerLName;     // last name
        String customerAddress;   // address for delivery
        long customerMn;// mobile no

        public Customer() {
            this.customerId = customerId;
            this.customerFName = customerFName;
            this.customerLName = customerLName;
            this.customerAddress = customerAddress;
            this.customerMn = customerMn;
        }
    }