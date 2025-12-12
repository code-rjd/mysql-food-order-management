package com.coderjd;

import com.coderjd.controller.*;

import java.sql.SQLException;
import java.util.Scanner;

public class FoodOrderManagement {
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {

            CustomerController customerController = new CustomerController();
            DeliveryAgentController deliveryAgentController = new DeliveryAgentController();
            MenuController menuController = new MenuController();
            RestaurantController restaurantController = new RestaurantController();
            OrderController orderController = new OrderController();
            BillingController billingController = new BillingController();
            OrderDeliveryController orderDeliveryController = new OrderDeliveryController();

            int option = 0 ;
            do {
            System.out.println("\n----------Welcome to Food Order Management----------\n");
            System.out.println("Please choose your section");
            System.out.println("1.Customer");
            System.out.println("2.Delivery agent");
            System.out.println("3.Restaurant");
            System.out.println("4.Order food");
            System.out.println("5.Menu");
            System.out.println("6.Bill Section");
            System.out.println("7.Check Order delivery details and status");

            System.out.println("0. EXIT\n");

                System.out.println("please enter option in digits");
                option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1:
                        try {
                            customerController.customerControllerPackage();
                        } catch (SQLException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case 2:
                        deliveryAgentController.deliveryAgentcontrollerPackage();
                        break;
                    case 3:
                        restaurantController.restaurantPackage();
                        break;
                    case 4:
                        orderController.ordercontrollerPackage();
                        break;
                    case 5:
                        menuController.menuPackage();
                        break;
                    case 6:
                        billingController.billingControllerPackage();
                        break;
                    case 7:
                        orderDeliveryController.orderDeliverPackage();
                        break;
                    default:
                        System.out.println("invalid option entered");
                        break;
                }
            } while (option != 0) ;

        }
}
// update the customer method to return back the pointer to customer controller