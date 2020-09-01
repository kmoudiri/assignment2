package gr.codehub;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStore extends SimpleRetailStore{
    List<Product> productList = new ArrayList<>();

    public InventoryRetailStore() {
    }


    public void getInventory() {
        productList.stream()
                .map(p -> p.getName())
                .forEach(System.out::println);
    }

    public void reset() {
        productList.removeAll(productList);
        setTotalBuyBalance(0);
        setTotalSellBalance(0);
    }


    public void buy(Product product) {
        super.buy(product);
        productList.add(product);
    }

    public void sell(Product product) {
        super.sell(product);
        productList.remove(product);
    }

}
