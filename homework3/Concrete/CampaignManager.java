
package gamedemo.Concrete;

import gamedemo.Abstracts.CampaignService;
import gamedemo.Entities.Campaign;


public class CampaignManager implements CampaignService{

    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getCompaignName()+"  added.");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCompaignName()+"  deleted.");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCompaignName()+"  updated.");
    }
    
}
