package bicycles;

public abstract class BicycleBase implements Bicycle{
    protected   int speed;
    public BicycleType bicycleType;

    protected void changeSpeed(int speedChange){

        speed += speedChange;

    }

    @Override
    public BicycleType bicycleTypes() {
        return bicycleType;
    }

    public int currentSpeed(){
        //if speed is not 0 return current speed
        if(speed != 0){
            return  speed;
        }
        else{
            return 0;
        }
    }

    public void stop(){

        speed = 0;
    }

}
