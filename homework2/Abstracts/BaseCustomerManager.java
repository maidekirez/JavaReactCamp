package ─▒nterfaceabstractdemo.Abstract;

import ─▒nterfaceabstractdemo.Entities.Customer;


public abstract class BaseCustomerManager implements CustomerServiceInterface {
    
    @Override
    public void save(Customer customer) {
         System.out.println("saved to Db:  "+customer.getFirstName());
    }
    
    
}

