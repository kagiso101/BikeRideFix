package bicycles.models;
import bicycles.BicycleBase;
import bicycles.BicycleType;

//runs implementation of bicycle methods as it inherits the methods from bicycleBase , which implements the bicycle

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