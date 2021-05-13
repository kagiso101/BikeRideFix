package bicycles.models;

import bicycles.Bicycle;
import bicycles.BicycleBase;
import bicycles.BicycleType;

public class MountainBike extends BicycleBase {


    @Override
    public BicycleType bicycleTypes() {
        return bicycleType.MountainBike;
    }

    @Override
    public void accelerate() {
        changeSpeed(5);
    }

    @Override
    public void brake() {
        changeSpeed(-3);
    }

}
