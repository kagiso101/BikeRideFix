package bicycles.rides;

import bicycles.Bicycle;
import bicycles.rides.BikeRide;
//implements BikeRide methods ,inherited from the bikeRide interface
public class BikeRideOne implements BikeRide {
    public final Bicycle bicycle;

    public BikeRideOne(Bicycle bicycle){
        this.bicycle = bicycle;
    }
    public void ride(Bicycle bicycle) {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }
   public int currentSpeed(){
        return this.bicycle.currentSpeed();
   }
     public void stopRide(){
        this.bicycle.stop();
   }


}
