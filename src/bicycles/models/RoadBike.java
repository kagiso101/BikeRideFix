package bicycles.models;

import bicycles.Bicycle;
import bicycles.BicycleBase;
import bicycles.BicycleType;

//runs implementation of bicycle methods as it inherits the methods from bicycleBase , which implements the bicycle

public class RoadBike extends BicycleBase {

    @Override
    public void accelerate() {
        changeSpeed(11);
    }
    @Override
    public BicycleType bicycleTypes() {
        return bicycleType.RoadBike;
    }

    @Override
    public void brake() {
        changeSpeed(-4);
    }
}
