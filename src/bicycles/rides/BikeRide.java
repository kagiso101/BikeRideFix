package bicycles.rides;

import bicycles.Bicycle;

//defines what the bikeRide  should do ,the methods it should have but no actual implementation of the methods
public interface BikeRide {
    void ride(Bicycle bicycle);
    int currentSpeed();
}
