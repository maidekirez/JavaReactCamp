
package ınterfaceabstractdemo;

import Adapters.MernisServiceAdapters;
import ınterfaceabstractdemo.Abstract.BaseCustomerManager;
import ınterfaceabstractdemo.Concrete.NeroCustomerManager;
import ınterfaceabstractdemo.Concrete.StarbucksCustomerManager;
import ınterfaceabstractdemo.Entities.Customer;


public class Main {
    
    public static void main(String[] args){
        Customer customer1 = new Customer(2,"customer1","customer1","1998" ,"42898908570");

        BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
        baseCustomerManager.save(customer1);
        System.out.println();
        
        
    }
}

