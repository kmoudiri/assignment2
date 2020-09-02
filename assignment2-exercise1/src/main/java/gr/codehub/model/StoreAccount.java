package gr.codehub.model;

public class StoreAccount extends Account{
    private String storeName;
    private Category accountCategory;

    public StoreAccount(String owner, Double balance, int numberOfTransactions, String storeName, Category accountCategory) {
        super(owner, balance, numberOfTransactions);
        this.storeName = storeName;
        this.accountCategory = accountCategory;
    }

    public void changeCategory(Category category) {
        accountCategory = category;
    }

    public void testerStoreAccount(int selection, double amount) {
            testerAccount(selection,amount);
    }

    public void testerStoreAccount(int select, Category category) {
        changeCategory(category);
    }

    public String getStoreName() {
        return storeName;
    }

    public Category getAccountCategory() {
        return accountCategory;
    }
}
