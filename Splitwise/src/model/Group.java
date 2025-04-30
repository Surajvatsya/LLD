package model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String id;
    private String name;
    private String desc;
    private List<User> userList;
    private double totalExpense;
    private List<Expense> expenseList;

    public String getId() {
        return id;
    }

    public Group(String name, String desc, String id) {
        this.id = id;
        this.name = name;
        this.userList = new ArrayList<>();
        this.desc = desc;
        this.expenseList = new ArrayList<>();
        this.totalExpense = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(double totalExpense) {
        this.totalExpense = totalExpense;
    }
    public void addUser(User user) {
        this.userList.add(user);
    }
    public void addExp(Expense expense) {
        this.expenseList.add(expense);
    }

//    public void settleUp(){
//
//    }

}
