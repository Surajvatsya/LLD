package model.strategy.fee;

public class NormalSeason implements FeeStrategy{

    @Override
    public double calculateFeeStrategy(int basePrice) {
        return basePrice;
    }
}
