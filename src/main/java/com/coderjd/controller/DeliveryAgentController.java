package com.coderjd.controller;

import com.coderjd.model.DeliveryAgent;
import com.coderjd.service.DeliveryAgentService;
import java.util.Scanner;

public class DeliveryAgentController {
    private Scanner scanner = new Scanner(System.in);
    private DeliveryAgentService deliveryAgentService = new DeliveryAgentService();


    public DeliveryAgent deliveryAgentcontrollerPackage() {
        System.out.println("-----------DeliveryAgent Section-----------");
        System.out.println("201. Add DeliveryAgent");
        System.out.println("202. Delete DeliveryAgent");
        System.out.println("203. Display DeliveryAgent details using DeliveryAgent ID");
        System.out.println("204. Display All DeliveryAgent");
        System.out.println("000. EXIT\n");

        int optionDeliveryAgent = 0;

        do {
            System.out.println("Please enter option in given DIGIT CODE ONLY");
            optionDeliveryAgent = Integer.parseInt(scanner.nextLine());

            switch (optionDeliveryAgent) {
                case 201:
                    deliveryAgentService.addDeliveryAgent();
                    break;
                case 202:
                    deliveryAgentService.deleteDeliveryAgent();
                    break;
                case 203:
                    deliveryAgentService.displayDeliveryAgent();
                    break;
                case 204:
                    deliveryAgentService.displayAllDeliveryAgent();
                    break;
                default:
                    System.out.println("invalid option entered");
                    break;
            }
        }
        while (optionDeliveryAgent != 000);
    return  null;
    }
}
