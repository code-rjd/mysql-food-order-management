
package com.coderjd.controller;
import com.coderjd.model.Customer;
import com.coderjd.service.CustomerService;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerController {

    private Scanner scanner = new Scanner(System.in);
    private CustomerService customerService = new CustomerService();

    public Customer customerControllerPackage() throws SQLException {

        int optionCustomer = 0;

        do {
            System.out.println("-----------Customer Section-----------");
            System.out.println("101. Add Customer");
            System.out.println("102. Delete Customer");
            System.out.println("103. Display Customer details using customer ID");
            System.out.println("104. Display All Customers");
            System.out.println("000. EXIT\n");

            System.out.println("Please enter option in given DIGIT CODE ONLY\n");
            optionCustomer = Integer.parseInt(scanner.nextLine());

            switch (optionCustomer) {
                case 101:
                    customerService.addCustomer();
                    break;
                case 102:
                    customerService.deleteCustomer();
                    break;
                case 103:
                    customerService.displayCustomer();
                    break;
                case 104:
                    customerService.displayAllCustomer();
                    break;
                default:
                    System.out.println("invalid option entered");
                    break;
            }
        }while (optionCustomer != 0);
        return null;
    }
    }

