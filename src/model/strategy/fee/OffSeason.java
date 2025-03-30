package model.strategy.fee;

public class OffSeason implements FeeStrategy{
    @Override
    public double calculateFeeStrategy(int basePrice) {
        return (basePrice*0.5);
    }
}
