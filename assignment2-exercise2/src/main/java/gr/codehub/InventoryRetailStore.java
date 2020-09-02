package gr.codehub;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStore extends SimpleRetailStore implements IStore {
    List<Product> productList = new ArrayList<>();

    public InventoryRetailStore() {
    }


    @Override
    public void getInventory() {
        System.out.println("Print the inventory: ");
        productList.stream()
                .map(p -> p.getName())
                .forEach(System.out::println);
    }

    @Override
    public void reset() {
        productList.removeAll(productList);
        setTotalBuyBalance(0);
        setTotalSellBalance(0);
    }

    @Override
    public void buy(Product product) {
        super.buy(product);
        productList.add(product);
    }

    @Override
    public void sell(Product product) {
        if (productList.contains(product)) {
            super.sell(product);
            productList.remove(product);
        } else {
            System.out.println("There is not product: \"" + product.getName() + "\" to store! CANT SELL");

        }

    }

}
