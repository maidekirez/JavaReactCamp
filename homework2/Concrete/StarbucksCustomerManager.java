
package ─▒nterfaceabstractdemo.Concrete;

import ─▒nterfaceabstractdemo.Abstract.BaseCustomerManager;
import ─▒nterfaceabstractdemo.Abstract.PersonCheckServiceInterface;
import ─▒nterfaceabstractdemo.Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager {
    
   private PersonCheckServiceInterface personCheckService;
   
   

    @Override
    public void save(Customer customer) {
        if(personCheckService.CheckIfRealPerson(customer)){
            super.save(customer); 
        }
        else{
          //  throw new Exception("Not a valid person");
        }
        
        
        
    }
    
    
}
