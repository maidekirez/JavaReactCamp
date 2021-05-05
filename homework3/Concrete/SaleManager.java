
package gamedemo.Concrete;

import gamedemo.Abstracts.SaleService;
import gamedemo.Entities.Sale;


public class SaleManager implements SaleService {
    
    
    

    @Override
    public void add(Sale sale) {
        System.out.println(sale.getGameName()+" added.");
    }

    @Override
    public void delete(Sale sale) {
        System.out.println(sale.getGameName()+" deleted.");
    }
    
   
}
