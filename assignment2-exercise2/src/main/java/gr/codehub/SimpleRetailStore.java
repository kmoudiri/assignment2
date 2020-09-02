package gr.codehub;


public class SimpleRetailStore implements IStore{
    private double totalBuyBalance;
    private double totalSellBalance;

    public SimpleRetailStore() {
    }

    @Override
    public void buy(Product product) {
        totalBuyBalance += product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {
        totalSellBalance += product.getPriceWhenSell();
    }

    @Override
    public double getRevenue() {
        return totalSellBalance - totalBuyBalance;
    }

    public double getTotalBuyBalance() {
        return totalBuyBalance;
    }

    @Override
    public void getInventory() {

    }

    @Override
    public void reset() {

    }

    public void setTotalBuyBalance(double totalBuyBalance) {
        this.totalBuyBalance = totalBuyBalance;
    }

    public double getTotalSellBalance() {
        return totalSellBalance;
    }

    public void setTotalSellBalance(double totalSellBalance) {
        this.totalSellBalance = totalSellBalance;
    }
}
