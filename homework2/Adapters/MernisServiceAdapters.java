
package Adapters;

import ─▒nterfaceabstractdemo.Abstract.PersonCheckServiceInterface;
import ─▒nterfaceabstractdemo.Entities.Customer;


public class MernisServiceAdapters implements PersonCheckServiceInterface{

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
          IMKKPSPublicSoap client = new IMKKPSPublicSoap();
        return client.TCKimlikNoDogrula(
                Long.parseLong(customer.getNationalityId()),
                customer.getFirstName().toUpperCase(),
                customer.getLastName().toUpperCase(),
                customer.getDateOfBirth()
        );
    }
    
}
