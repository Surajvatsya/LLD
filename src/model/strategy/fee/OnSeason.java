package model.strategy.fee;

public class OnSeason implements FeeStrategy{
    @Override
    public double calculateFeeStrategy(int basePrice) {
        return basePrice*1.5;
    }
}
