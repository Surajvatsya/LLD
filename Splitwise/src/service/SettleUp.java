package service;

import model.Group;
import model.Split;
import model.User;

public class SettleUp {
    private User paidByUser;
    private User paidToUser;
    private Split split;
    private int totalAmontExpense;
    private Group group;

    public SettleUp(User paidByUser, User paidToUser, Split split, int totalAmontExpense) {
        this.paidByUser = paidByUser;
        this.paidToUser = paidToUser;
        this.split = split;
        this.totalAmontExpense = totalAmontExpense;
    }

    public void settleUp(){
        
    }

}
