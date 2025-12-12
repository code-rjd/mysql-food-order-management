package com.coderjd.service;

import com.coderjd.model.Billing;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BillingService {

    private Scanner scanner = new Scanner(System.in);
    private List<Billing> billingList = new LinkedList<>();

    public Billing createBill() {

        Billing billing = new Billing();

        System.out.println("Enter Bill order id ");
        billing.setBillingId(Integer.parseInt(scanner.nextLine()));

//        System.out.println("Enter Order id ");
//        billing.setOrderId(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter total tax on bill ");
        billing.setTotalTax(scanner.nextDouble());

        System.out.println("Enter total price of the final bill");
        billing.setFinalBill(scanner.nextDouble());

        return billing;
    }

    public Billing deleteBill() {
        int deleteBill;
        System.out.println("Enter bill id ");
        deleteBill = Integer.parseInt(scanner.next());
        try {
           billingList.contains(deleteBill);
            System.out.println("Bill with id: " + deleteBill + " has been deleted ");
            billingList.remove(deleteBill);
        }
        catch (Exception e){
            System.err.println("bill not found ");
        }
        return deleteBill();
    }

    public Billing displayBill() {
        System.out.println("Enter bill id ");
        String tryid = scanner.next();
        if (tryid.isEmpty()) {
            System.out.println("Enter valid bill id ");
        } else {
            try {
                int displayBillId = Integer.parseInt(tryid);
                if (billingList.contains(displayBillId)) {
                    System.out.println("Bill details : " + billingList.get(displayBillId));
                }
            } catch (NumberFormatException e) {
                System.err.println(" Enter the bill id in digits only" + e.getMessage());
            }
        }
        return displayBill();
    }

    public Billing displayAllBills(){
        for (Billing billing : billingList) {
            System.out.println(billing);
        }
        return displayAllBills();
    }
}