package gr.codehub;

public class Main {
    public static void main(String[] args) {
        Product x1 = new Product(1, "Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product(2, "Painting Tsarouxis. Naftis A", 200, 2000);
        Product x4 = new Product(3, "Chair. Luis XV", 100, 1000);

        IStore simple= new SimpleRetailStore();

        simple.buy(x1); simple.buy(x4); simple.sell(x1);
        System.out.println("GET REVENUE FOR SIMPLE STORE: " + simple.getRevenue());

        InventoryRetailStore invStore = new InventoryRetailStore();
        invStore.buy(x1); invStore.buy(x4); invStore.sell(x1);
        System.out.println("GET REVENUE FOR INVENTORY STORE: " + invStore.getRevenue());
        invStore.sell(x2);
        invStore.getInventory();
        invStore.reset();
        System.out.println("RESETED");
        invStore.getInventory();

    }
}
