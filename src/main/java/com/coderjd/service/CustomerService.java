package com.coderjd.service;

import com.coderjd.model.Customer;
import com.coderjd.repository.CustomerRepository;

import java.sql.SQLException;
import java.util.*;

public class CustomerService {

    private static final List<Customer> customersList = new LinkedList<>();
    private final Scanner scanner = new Scanner(System.in);
    private static final CustomerRepository customerRepository = new CustomerRepository();

    public Customer addCustomer() {
        Customer customer = new Customer();
        System.out.println("Enter customer id ");
        customer.setCustomerId(Integer.parseInt(scanner.nextLine()));

        System.out.println("enter Customer's first name");
         customer.setCustomerFName(scanner.nextLine());

        System.out.println(" Enter Customer's last name");
        customer.setCustomerLName(scanner.nextLine());

        System.out.println("Enter Customer's address");
            customer.setCustomerAddress(scanner.nextLine());

        System.out.println("Enter Customer's Mobile No");
        customer.setCustomerMn(scanner.nextLong());


//        if(customersList.contains(customer)){
//            System.out.println("Customer already exists ");
//        } else{
//            customersList.add(customer);
//        }
       try{
           if (customerRepository.addCustomer(customer)){
               System.out.println("Customer added successfully");
           }else{
               System.out.println("Customer add failed");
           }
       }catch(SQLException e){
           throw new RuntimeException(e.getMessage());
       }
       return customer;
    }

    public boolean deleteCustomer() throws SQLException {
        System.out.println("Enter customer id ");
        int deleteCustomerId = Integer.parseInt(scanner.next());
        int rowsDeleted = customerRepository.deleteCustomer().getCustomerId();
        if (rowsDeleted > 0) {
            System.out.println("[SERVICE] Customer successfully deleted (ID: " + deleteCustomerId + ").");
            return true;
        } else {
            System.out.println("[SERVICE] Customer deletion failed (ID: " + deleteCustomerId + "). Customer may not exist.");
            return false;
        }
    }

    public Customer displayCustomer() {
        System.out.println("Enter customer id ");
        String tryid = scanner.next();
        if(tryid.isEmpty()) {
            System.out.println("Enter valid customer id ");
        }else {
            try {
                int displayCustomerId = Integer.parseInt(tryid);
                if (customersList.contains(displayCustomerId)) {
                    System.out.println("Customer details : " + customersList.get(displayCustomerId));
                }
            } catch (NumberFormatException e) {
                System.err.println(" Enter the customer id in digits only" + e.getMessage());
            }
        }
        return null;
            }

    public Customer displayAllCustomer() {
        Iterator<Customer> iteratorCustomer = customersList.iterator();
        while(iteratorCustomer.hasNext()){
            System.out.println(" All Customer details :" + iteratorCustomer.next());
        }
        return null;
    }
}

// in registerCustomer method, the customer returns and data is saved
// but program run is directed towards options,
// and if customer registration is chosen for more than 3 times, it shows error
// my recommendation is to provide while or do while loop, so it won't proceed
// and display a message - customer registration is full