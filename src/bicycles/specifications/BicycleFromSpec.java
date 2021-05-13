package bicycles.specifications;

import bicycles.BicycleBase;

public class BicycleFromSpec extends BicycleBase {
    public final BicycleSpecification bikeSpecs;

    public BicycleFromSpec(BicycleSpecification bikeSpecs){

        this.bikeSpecs = bikeSpecs;
    }
    @Override

    public void accelerate(){

        this.changeSpeed(this.bikeSpecs.getAcceleration());
    }
    @Override
    public void brake(){

        this.changeSpeed(this.bikeSpecs.getBrake());
    }

}
