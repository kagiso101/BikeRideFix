package bicycles.models;

//import bicycles.models.MountainBike;
import bicycles.Bicycle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MountainBikeTests {
    @Test
    public void shouldAccelerate() {

        Bicycle bicycle = new MountainBike();
        bicycle.accelerate();
        assertEquals(5, bicycle.currentSpeed());
    }
    @Test
    public void shouldAccelerateAndBrake() {

        Bicycle bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(2, bicycle.currentSpeed());
    }
    @Test
    public void multipleAccelerationsAndBrake() {

        Bicycle bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();

        assertEquals(14, bicycle.currentSpeed());
    }
    @Test
    public void shouldStop() {

        Bicycle bicycle = new MountainBike();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());
    }

}
