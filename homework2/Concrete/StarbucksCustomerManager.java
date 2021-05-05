
package ınterfaceabstractdemo.Concrete;

import ınterfaceabstractdemo.Abstract.BaseCustomerManager;
import ınterfaceabstractdemo.Abstract.PersonCheckServiceInterface;
import ınterfaceabstractdemo.Entities.Customer;


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
