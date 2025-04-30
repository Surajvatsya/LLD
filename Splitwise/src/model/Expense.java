package model;

import java.util.List;

public class Expense {
    private String expenseBy; //userId of user
    private String description;
    private double amount;
    private SplitType splitType;
    private List<Split> splitBetween;


    public Expense(String expenseBy, String description, double amount, SplitType splitType, List<Split> splitBetween) {
        this.expenseBy = expenseBy;
        this.description = description;
        this.amount = amount;
        this.splitType = splitType;
        this.splitBetween = splitBetween;
    }

    public String getExpenseBy() {
        return expenseBy;
    }

    public void setExpenseBy(String expenseBy) {
        this.expenseBy = expenseBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public void setSplitType(SplitType splitType) {
        this.splitType = splitType;
    }

    public List<Split> getSplitBetween() {
        return splitBetween;
    }

    public void setSplitBetween(List<Split> splitBetween) {
        this.splitBetween = splitBetween;
    }
}
