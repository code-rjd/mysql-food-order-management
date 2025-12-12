package com.coderjd.service;
import com.coderjd.controller.MenuController;
import com.coderjd.model.Menu;
import com.coderjd.model.Restaurant;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MenuService {

    private List<Menu> menulist   = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);


    public Menu addMenu() {
        Menu menu = new Menu();
        MenuController menuController = new MenuController();
        RestaurantService restaurantService = new RestaurantService();
        System.out.println("Enter Menu id");
        menu.setMenuId(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter Restaurant id whose menu is to be updated");
        int tryRID = Integer.parseInt(scanner.nextLine());
        try {
            if(restaurantService.checkRestaurantId()) {
                menu.RestaurantId = tryRID;
            }
        } catch (Exception vre) {
            System.err.println("Restaurant id doesnt exist. Enter Valid Restaurant id");
            menuController.menuPackage();
        }

        System.out.println("enter food item name");
        menu.setMenuName(scanner.nextLine());

        System.out.println(" Enter food item description");
        menu.setMenuDescription(scanner.nextLine());

        System.out.println("Enter taste of food item");
        menu.setMenuTaste(scanner.nextLine());

        System.out.println("Enter measurement unit of food item");
        menu.setMenuM(scanner.nextLine());

        System.out.println("Enter price of food item");
        menu.setMenuPrice(scanner.nextDouble());

        return menu;
    }

    public void deleteMenu(){
        System.out.println("Enter Menu id ");
        int deleteMenu = Integer.parseInt(scanner.nextLine());
        if(menulist.contains(deleteMenu))
        {
            System.out.println("registered menu id" + deleteMenu + "is deleted");
            menulist.remove(deleteMenu);
        }else {
            System.out.println("Menu not found");
        }

    }

    public void displayMenu() {
        System.out.println("Enter menu id ");
        int displayMenu = Integer.parseInt(scanner.nextLine());
        try{
            menulist.contains(displayMenu);
            System.out.println("Menu registered:" + displayMenu);
        } catch (Exception e) {
            System.err.println("Menu not found");;
        }
    }

    public void displayAllMenu(){
        for (Menu menu : menulist) {
            System.out.println("Menu: " + menu);
        }
    }
}
