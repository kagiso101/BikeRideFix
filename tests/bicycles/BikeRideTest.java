package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BikeRideTest {
    //MountainBike
    @Test
    public void mountainBikeShouldRide() {

        Bicycle bicycle = new MountainBike();
        BikeRide bikeRide= new BikeRideOne(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(14, bikeRide.currentSpeed());
    }

    //RoadBike
    @Test
    public void roadBikeShouldRide() {

        Bicycle bicycle = new RoadBike();
        BikeRide bikeRide= new BikeRideOne(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(36, bikeRide.currentSpeed());
    }

    @Test
    public void getCounterForOneMountainBike(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new MountainBike();
        takeARide.accept(bicycle);
        assertEquals(1, takeARide.getEnteredCount());
    }

    @Test
    public void getCounterForMultipleMountainBike(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new MountainBike();
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        assertEquals(3, takeARide.getEnteredCount());
    }
    @Test
    public void getCounterForOneTandem(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new Tandem();
        takeARide.accept(bicycle);
        assertEquals(1, takeARide.getEnteredCount());
    }
    @Test
    public void getCounterForMultipleTandems(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new Tandem();
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        assertEquals(3, takeARide.getEnteredCount());
    }
    @Test
    public void getCounterForOneRoadBike(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new RoadBike();
        takeARide.accept(bicycle);
        assertEquals(1, takeARide.getEnteredCount());
    }
    @Test
    public void getCounterForMultipleRoadBikes(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new RoadBike();
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        assertEquals(5, takeARide.getEnteredCount());
    }
    @Test
    public void getCounterForDifferentTypes(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new RoadBike();
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        assertEquals(3, takeARide.getCountForType(BicycleType.RoadBike));
    }
}
