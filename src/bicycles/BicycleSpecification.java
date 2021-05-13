package bicycles;

public class BicycleSpecification {
//    private final BicycleType bicycleType;

    private int accelerationSpeed;
    private  int  brakeSpeed;
    public final BicycleType bicycleType;

   //takes in 3 params : acc,brake,bikeTpe and sets the values
    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType){
        this.bicycleType = bicycleType;
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
    }
    //gets the acc of specified bike speed
    public int getAcceleration(){
        return accelerationSpeed;
    }
    //gets the brake speed of specified brake
    public int getBrake(){
        return brakeSpeed;
    }
    //gets the specified bike type
    public BicycleType getBicycleType(){
        return bicycleType;
    }

}
