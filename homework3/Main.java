
package gamedemo;

import gamedemo.Entities.Campaign;
import gamedemo.Entities.User;
import gamedemo.Entities.Sale;
import gamedemo.Abstract.CampaignService;
import gamedemo.Abstract.SaleService;
import gamedemo.Abstract.UserService;
import gamedemo.Abstract.UserValidationService;
import gamedemo.Concrete.CampaignManager;
import gamedemo.Concrete.SaleManager;
import gamedemo.Concrete.UserManager;
import gamedemo.Concrete.UserValidationManager;




public class Main {
    
    public static void main(String[] args) {
        User user=new User(1, "user", "user1", "user1", "123456789", "2000", "123456789");
        Campaign campaign= new Campaign(1,"compaign",60,50,"compaign1");
        UserManager userManager=new UserManager(new UserValidationManager());
        userManager.add(user);
        System.out.println(campaign.getPriceAfterSale());
        
    }
    
}
