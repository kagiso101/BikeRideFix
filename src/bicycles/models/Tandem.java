package bicycles.models;
import bicycles.BicycleBase;
import bicycles.BicycleType;

public class Tandem extends BicycleBase{
    @Override
    public BicycleType bicycleTypes() {
        return bicycleType.Tandem;
    }

    @Override
    public void accelerate() {
        changeSpeed(12);
    }
    @Override
    public void brake() {
        changeSpeed(-7);
    }
}