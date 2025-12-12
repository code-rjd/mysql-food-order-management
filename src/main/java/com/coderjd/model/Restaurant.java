package com.coderjd.model;

@lombok.Data
public class Restaurant {
    public int restarantId;           //id
    public String restarantName;     // restaurant  name// restaurant owner last name
    public String restarantAddress;   // restaurant address for KYC
    public int restarantMobileno;          // restaurant  mobile no
    public int restarantFssai; // restaurant  fssai no for KYC
    public Menu menuId;          // Menu Id
}