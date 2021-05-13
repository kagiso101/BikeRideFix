package bicycles.specifications;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import bicycles.rides.BikeRide;
import bicycles.rides.BikeRideOne;
import bicycles.specifications.BicycleFromSpec;
import bicycles.specifications.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecificationTest {
    @Test
    public void shouldSpecifyMountainBikeRide() {

        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, 4 , BicycleType.MountainBike);
        Bicycle bicycleSpec = new BicycleFromSpec(bicycleSpecification);
        Bicycle bicycle = new MountainBike();
        BikeRide bikeRide= new BikeRideOne(bicycle);
        bikeRide.ride(bicycleSpec);
        assertEquals(14, bikeRide.currentSpeed());
    }

    @Test
    public void shouldSpecifyRoadBikeRide() {

        BicycleSpecification bicycleSpecification = new BicycleSpecification(5, 3 , BicycleType .RoadBike);
        Bicycle bicycleSpec = new BicycleFromSpec(bicycleSpecification);
        Bicycle bicycle = new RoadBike();
        BikeRide bikeRide= new BikeRideOne(bicycle);
        bikeRide.ride(bicycleSpec);
        assertEquals(36, bikeRide.currentSpeed());
    }
    @Test
    public void shouldSpecifyTandemRide() {
        //specifying the bike type
        BicycleSpecification bicycleSpecification = new BicycleSpecification(12, 7 , BicycleType.Tandem);
        //getting the methods for specified bike type
        Bicycle bicycleSpec = new BicycleFromSpec(bicycleSpecification);
        //calling specified bike type methods
        Bicycle bicycle = new Tandem();
        //calling the bike ride method
        BikeRide bikeRide = new BikeRideOne(bicycle);
        //taking the specified bike type(tandem) for a ride
        bikeRide.ride(bicycleSpec);
        assertEquals(34, bikeRide.currentSpeed());
    }

}
