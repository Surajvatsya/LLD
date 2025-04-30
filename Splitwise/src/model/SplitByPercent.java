package model;

public class SplitByPercent extends Split{
    private double percentage;
    public SplitByPercent(User user) {
        super(user);
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
