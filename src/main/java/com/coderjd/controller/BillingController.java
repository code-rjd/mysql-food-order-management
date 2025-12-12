package com.coderjd.controller;

import com.coderjd.model.Billing;
import com.coderjd.service.BillingService;
import java.util.Scanner;

public class BillingController {
    private final Scanner scanner = new Scanner(System.in);
    private final BillingService billingService = new BillingService();

    public Billing billingControllerPackage() {
        System.out.println("-----------Billing Section-----------");
        System.out.println("601. Create new Bill");
        System.out.println("602. Delete bill");
        System.out.println("603. Display bill details using Bill ID");
        System.out.println("604. Display all bills ");
        System.out.println("000. EXIT\n");

        int optionBill = 0;

        do {
            System.out.println("Please enter option in given DIGIT CODE ONLY");
            optionBill = Integer.parseInt(scanner.nextLine());

            switch (optionBill) {
                case 601:
                    billingService.createBill();
                    break;
                case 602:
                    billingService.deleteBill();
                    break;
                case 603:
                    billingService.displayBill();
                    break;
                case 604:
                    billingService.displayAllBills();
                    break;
                default:
                    System.out.println("invalid option entered");
                    break;
            }
        }
        while (optionBill != 000);
        return null;
    }
}
