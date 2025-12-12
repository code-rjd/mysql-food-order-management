package com.coderjd.controller;

import com.coderjd.model.Restaurant;
import com.coderjd.service.RestaurantService;

import java.util.Scanner;

public class RestaurantController {
    private Scanner scanner = new Scanner(System.in);
    private RestaurantService restaurantService = new RestaurantService();


    public Restaurant restaurantPackage() {
        System.out.println("-----------Restaurant Section-----------");
        System.out.println("301. Add new Restaurant");
        System.out.println("302. Delete Restaurant");
        System.out.println("303. Display Restaurant details using Restaurant ID");
        System.out.println("304. Display All Restaurants");
        System.out.println("000. EXIT\n");

        int optionRestaurant = 0;

        do {
            System.out.println("Please enter option in given DIGIT CODE ONLY");
            optionRestaurant = Integer.parseInt(scanner.nextLine());

            switch (optionRestaurant) {
                case 301:
                    restaurantService.addRestaurant();
                    break;
                case 302:
                    restaurantService.deleteRestaurant();
                    break;
                case 303:
                    restaurantService.displayRestaurant();
                    break;
                case 304:
                    restaurantService.displayAllRestaurant();
                    break;
            }
        }
        while (optionRestaurant != 000);
        return null;
    }
}
