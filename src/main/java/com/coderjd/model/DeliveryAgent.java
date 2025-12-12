package com.coderjd.model;

@lombok.Data
public class DeliveryAgent {
    private int deliveryAgentId;           //id
    private String deliveryAgentFirstName;     //first name
    private String deliveryAgentLastName;     // last name
    private String deliveryAgentAddress;   // address for KYC
    private int deliveryAgentMobileNo;           // mobile no
    private int deliveryAgentAadhaar;       // Aadhaar no for KYC
}