package bicycles;


//defines what the bicycle class should do ,the methods it should have but no actual implementation of the methods
//interface methods are all abstract whether we declare it or not
public interface Bicycle {
    BicycleType bicycleTypes();
    void accelerate();
    void brake();
    int currentSpeed();
    void stop();
}