package gr.codehub;

import gr.codehub.model.Account;
import gr.codehub.model.Category;
import gr.codehub.model.StoreAccount;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Papadopoulos", 1_001.23,0);
        //selection 1 for withdraw, 2 for deposit
        account.testerAccount(1,200);
        account.testerAccount(2,10);
        account.testerAccount(1,10_000);
        System.out.println("Owner: " + account.getOwner() + ". New balance: " + account.getBalance()
                + ". Number of transactions: " + account.getNumberOfTransactions());


        System.out.println("\n \n Now lets see a store Account \n \n");
        StoreAccount storeAccount = new StoreAccount("Alexiou", 1_000.10, 0, "AlexiouStore", Category.mid);
        //selection 1 for withdraw, 2 for deposit, 3 for change category
        storeAccount.testerStoreAccount(1, 200);
        storeAccount.testerStoreAccount(2,10);
        storeAccount.testerStoreAccount(1,10_000);
        storeAccount.testerStoreAccount(3, Category.extra);
        System.out.println("Store account owner: " + storeAccount.getOwner() + "Store name: " + storeAccount.getStoreName() +
                "\n New balance: " + storeAccount.getBalance() + ". Transactions: " + storeAccount.getNumberOfTransactions() +
                "\n Category: " + storeAccount.getAccountCategory());

    }
}
