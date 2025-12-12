package com.coderjd.controller;

import com.coderjd.model.Menu;
import com.coderjd.service.MenuService;

import java.util.Scanner;

public class MenuController {
    private Scanner scanner = new Scanner(System.in);
    private MenuService menuService = new MenuService();


    public Menu menuPackage() {
        System.out.println("-----------Menu Section-----------");
        System.out.println("401. Add new Menu");
        System.out.println("402. Delete Menu");
        System.out.println("403. Display Menu using Menu ID");
        System.out.println("404. Display All Menu");
        System.out.println("000. EXIT\n");

        int optionMenu = 0;

        do {
            System.out.println("Please enter option in given DIGIT CODE ONLY");
            optionMenu = Integer.parseInt(scanner.nextLine());

            switch (optionMenu) {
                case 401:
                    menuService.addMenu();
                    break;
                case 402:
                    menuService.deleteMenu();
                    break;
                case 403:
                    menuService.displayMenu();
                    break;
                case 404:
                    menuService.displayAllMenu();
                    break;
                default:
                    System.out.println("invalid option entered");
                    break;
            }
        }
        while (optionMenu != 000);
        return null;
    }
}
