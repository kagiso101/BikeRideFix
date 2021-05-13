package bicycles;

public interface Bicycle {
    BicycleType bicycleTypes();
    void accelerate();
    void brake();
    int currentSpeed();
    void stop();
}