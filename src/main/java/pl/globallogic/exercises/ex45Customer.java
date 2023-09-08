package pl.globallogic.exercises;

import java.util.ArrayList;

public class ex45Customer {
    private String name;
    private ArrayList<Double> transactions;

    public ex45Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }
}
