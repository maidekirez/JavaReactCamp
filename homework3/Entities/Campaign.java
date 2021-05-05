
package gamedemo.Entities;


public class Campaign extends Sale {
    private int discount;
    private double priceAfterSale;
    private String compaignName;

    public Campaign() {
        
    }

    public Campaign(int id, String gameName, double price, int discount, String compaignName) {
        super(id, gameName, price);
        this.discount = discount;
        this.compaignName= compaignName;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getPriceAfterSale() {
        return getPrice() - (getPrice()*discount/100);
    }

    public String getCompaignName() {
        return compaignName;
    }

    public void setCompaignName(String compaignName) {
        this.compaignName = compaignName;
    }
    

}
    

