package com.coderjd.service;

import com.coderjd.model.DeliveryAgent;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DeliveryAgentService {
    int deliveryAgentsIndex = 0;
   private static Scanner scanner= new Scanner(System.in);
   private static final List<DeliveryAgent> deliveryAgentsList = new LinkedList<>();

    public DeliveryAgent addDeliveryAgent() {
        DeliveryAgent deliveryAgent = new DeliveryAgent();
        System.out.println("Enter Delivery Agent id ");
        String tryDAID = scanner.nextLine();
        if(tryDAID.isEmpty()){
            System.out.println("Enter valid Delivery Agent id ");
        }
        try {
            deliveryAgent.setDeliveryAgentId(Integer.parseInt(tryDAID));
        }catch(Exception e){
            System.out.println("Enter valid Delivery Agent id in digits only");
        }

        System.out.println("enter Delivery Agent's first name");
        deliveryAgent.setDeliveryAgentFirstName(scanner.nextLine());
        try {
            addDeliveryAgent().getDeliveryAgentFirstName().isEmpty();
            System.out.println("Enter valid first name");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }

        System.out.println(" Enter Delivery Agent's last name");
        deliveryAgent.setDeliveryAgentLastName(scanner.nextLine());
        try {
            addDeliveryAgent().getDeliveryAgentLastName().isEmpty();
            System.out.println("Enter valid last name");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }

        System.out.println("Enter Delivery Agent's address");
        deliveryAgent.setDeliveryAgentAddress(scanner.nextLine());
        try {
            addDeliveryAgent().getDeliveryAgentAddress().isEmpty();
            System.out.println("Enter valid Address");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }

        System.out.println("Enter Delivery Agent's Mobile No");
        String tryMobileNo = scanner.next();
        if(tryMobileNo.isEmpty()) {
            System.out.println("Enter valid Mobile No");
        }else {
            try {
                deliveryAgent.setDeliveryAgentMobileNo(Integer.parseInt(tryMobileNo));
            } catch (NumberFormatException e) {
                System.err.println(" Enter the mobile in digits only" + e.getMessage());
            }
        }
        System.out.println("Enter Delivery Agent's Aadhaar No");
        String tryAadhaarNo = scanner.next();
        if(tryAadhaarNo.isEmpty()) {
            System.out.println("Enter valid Aadhar No");
        }else {
            try {
                deliveryAgent.setDeliveryAgentAadhaar(Integer.parseInt(tryAadhaarNo));
            } catch (NumberFormatException e) {
                System.err.println(" Enter the Aadhar number in digits only" + e.getMessage());
            }
        }
        return deliveryAgent;
   }

    public DeliveryAgent deleteDeliveryAgent() {
        int deleteDeliveryAgent = 0;
        System.out.println("Enter DeliveryAgent id ");
        String tryid = scanner.next();

        if(tryid.isEmpty()) {
            System.out.println("Enter valid DeliveryAgent id ");
        }else {
            try {
                deleteDeliveryAgent = Integer.parseInt(String.valueOf(tryid));
                if(deliveryAgentsList.contains(deleteDeliveryAgent)) {
                    System.out.println("Customer " + deleteDeliveryAgent + " has been deleted ");
                    deliveryAgentsList.remove(deleteDeliveryAgent);
                }
            } catch (NumberFormatException e) {
                System.err.println(" Enter the customer id in digits only" + e.getMessage());
            }
        }
        return null;
    }

    public DeliveryAgent displayDeliveryAgent() {
        System.out.println("Enter Delivery Agent id ");
        String tryid = scanner.next();
        if(tryid.isEmpty()) {
            System.out.println("Enter valid Delivery agent id ");
        }else {
            try {
                int displayDeliveryAgentId = Integer.parseInt(String.valueOf(tryid));
                if (deliveryAgentsList.contains(displayDeliveryAgentId)) {
                    System.out.println("Customer details : " + deliveryAgentsList.get(displayDeliveryAgentId));
                }
            } catch (NumberFormatException e) {
                System.err.println(" Enter the customer id in digits only" + e.getMessage());
            }
        }
        return null;
    }

    public DeliveryAgent displayAllDeliveryAgent() {
        Iterator<DeliveryAgent> iteratorDeliveryAgent = deliveryAgentsList.iterator();
        while(iteratorDeliveryAgent.hasNext()){
            System.out.println(" All Customer details :" + iteratorDeliveryAgent.next());
        }
        return null;
    }
}