package bicycles;

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
//    public static void main(String[] args) {
//        Bicycle bicycle= new Bicycle();
//        BikeRide bikeRide= new BikeRide(bicycle);
//        bikeRide.ride();
//        bikeRide.currentSpeed();
//
//
//    }

}
