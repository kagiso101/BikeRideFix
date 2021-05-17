package bicycles.rides;

import bicycles.Bicycle;
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
    @Test
    public void mountainBikeShouldGoForMultipleRides() {

        Bicycle bicycle = new MountainBike();
        BikeRide bikeRide= new BikeRideOne(bicycle);
        bikeRide.ride(bicycle);
        bikeRide.ride(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(42, bikeRide.currentSpeed());
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
    public void roadBikeShouldGoForMultipleRides() {

        Bicycle bicycle = new RoadBike();
        BikeRide bikeRide= new BikeRideOne(bicycle);
        bikeRide.ride(bicycle);
        bikeRide.ride(bicycle);
        bikeRide.ride(bicycle);
        bikeRide.ride(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(180, bikeRide.currentSpeed());
    }
    //Tandem
    @Test
    public void TandemShouldRide() {

        Bicycle bicycle = new Tandem();
        BikeRide bikeRide= new BikeRideOne(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(34, bikeRide.currentSpeed());
    }
    @Test
    public void tandemShouldGoForMultipleRides() {

        Bicycle bicycle = new Tandem();
        BikeRide bikeRide= new BikeRideOne(bicycle);
        bikeRide.ride(bicycle);
        bikeRide.ride(bicycle);
        bikeRide.ride(bicycle);
        bikeRide.ride(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(170, bikeRide.currentSpeed());
    }

    @Test
    public void shouldStopTheMountainBikeRide() {

        Bicycle bicycle = new MountainBike();
        BikeRide bikeRide= new BikeRideOne(bicycle);
        ((BikeRideOne) bikeRide).stopRide();

        assertEquals(0, bikeRide.currentSpeed());
    }

    @Test
    public void shouldStopTheRoadBikeRide() {

        Bicycle bicycle = new RoadBike();
        BikeRide bikeRide= new BikeRideOne(bicycle);
        ((BikeRideOne) bikeRide).stopRide();

        assertEquals(0, bikeRide.currentSpeed());
    }
    @Test
    public void shouldStopTheTandemRide() {

        Bicycle bicycle = new Tandem();
        BikeRide bikeRide= new BikeRideOne(bicycle);
        ((BikeRideOne) bikeRide).stopRide();

        assertEquals(0, bikeRide.currentSpeed());
    }

}
