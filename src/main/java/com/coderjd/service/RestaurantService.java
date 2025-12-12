package com.coderjd.service;

import com.coderjd.model.Menu;
import com.coderjd.model.Restaurant;

import java.util.*;

public class RestaurantService {

    private Scanner scanner= new Scanner(System.in);
    private final static List<Restaurant> restaurantlist = new LinkedList<>();
    Menu menu = new Menu();

    public Restaurant addRestaurant() {

        Restaurant restaurant = new Restaurant();

        System.out.println("Enter Restaurant id ");
        String tryid = scanner.next();
        if(tryid.isEmpty()) {
            System.out.println("Enter valid Restaurant id ");
        }else{
            try {
                restaurant.setRestarantId(Integer.parseInt(tryid));
            } catch (NumberFormatException e) {
                System.err.println(" Enter the restaurant id in digits only" + e.getMessage());
            }
        }

        System.out.println("Enter Restaurant name ");
        restaurant.setRestarantName(scanner.nextLine());
        if(addRestaurant().getRestarantName().isEmpty())
        {
            System.out.println("Enter valid restaurant name");
        }

        System.out.println("Enter Restaurant's address");
        restaurant.setRestarantAddress(scanner.nextLine());
        if(addRestaurant().getRestarantAddress().isEmpty())
        {
            System.out.println("Enter valid restaurant's address");
        }

        System.out.println("Enter Restaurant's Mobile No");
        String tryMobileNo = scanner.next();
        if(tryMobileNo.isEmpty()) {
            System.out.println("Enter valid Restaurant mobile no ");
        }else{
            try {
                restaurant.setRestarantMobileno(Integer.parseInt(tryMobileNo));
            } catch (NumberFormatException e) {
                System.err.println(" Enter the restaurant mobile in digits only" + e.getMessage());
            }
        }
//        restaurant.setRestarantMobileno(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter Restaurant's FSSAI no.");
        String tryFSSAINo = scanner.next();
        if(tryFSSAINo.isEmpty()) {
            System.out.println("Enter valid Restaurant fssai no. ");
        }else{
            try {
                restaurant.setRestarantFssai(Integer.parseInt(tryFSSAINo));
            } catch (NumberFormatException e) {
                System.err.println(" Enter the restaurant FSSAI in digits only" + e.getMessage());
            }
        }
//        restaurant.setRestarantFssai(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter Restaurant's Menu ID no.");
        String tryMID = scanner.next();
        if(tryMID.isEmpty()) {
            System.out.println("Enter valid Restaurant menu id ");
        }else{
            try {
                if(true)   {
                   int tryMIDNew = Integer.parseInt(tryMID);
                   tryMIDNew = restaurant.restarantId;
                    System.out.println(" Restaurant id verified:" + restaurant.restarantId);
                }
            } catch (NumberFormatException e) {
                System.err.println(" Enter the restaurant menu id in digits only" + e.getMessage());
            }
        }

        if(restaurantlist.contains(restaurant)){
            restaurantlist.add(restaurant);
        }
        return null;
    }

    public void displayRestaurant() {
        System.out.println("Enter Restaurant id ");
        int displayRestaurant = Integer.parseInt(scanner.nextLine());
        try {
            restaurantlist.contains(displayRestaurant);
            System.out.println("Restaurants registered:" + displayRestaurant);
        }catch (Exception e){
            System.err.println("Restaurant not found");
        }
    }

    public void deleteRestaurant() {
        System.out.println("Enter Restaurant id ");
        int deleteRestaurant = Integer.parseInt(scanner.nextLine());
        if(restaurantlist.contains(deleteRestaurant))
        {
            System.out.println("Restaurants registered:" + deleteRestaurant);
            restaurantlist.remove(deleteRestaurant);
        }else {
            System.out.println("Restaurants not registered" );
        }
    }

    public void displayAllRestaurant() {
        Iterator<Restaurant> iteratorRestaurant = restaurantlist.iterator();
        while(iteratorRestaurant.hasNext()){
            System.out.println(" All Customer details :" + iteratorRestaurant.next());
        }
    }

    public boolean checkRestaurantId(){
        if(restaurantlist.contains(menu.RestaurantId)){
            System.out.println("Restaurant Id verified");
        }else{
            System.out.println("Restaurant Id NOT available");
        }
        return checkRestaurantId();
    }
}