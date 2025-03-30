package model;

public abstract class Gate {
    private int gateNumber;
    private Operator op;

    public Gate(int gatNumber, Operator op) {
        this.gateNumber = gatNumber;
        this.op = op;
    }

    public void setOperator (Operator op){
        this.op = op;
    }
}
