package bicycles.models;

import bicycles.Bicycle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RoadBikeTests {
    @Test
    public void shouldAccelerate() {

        Bicycle bicycle = new RoadBike();
        bicycle.accelerate();
        assertEquals(11, bicycle.currentSpeed());
    }
    @Test
    public void shouldAccelerateAndBrake() {

        Bicycle bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(7, bicycle.currentSpeed());
    }
    @Test
    public void multipleAccelerationsAndBrake() {

        Bicycle bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();

        assertEquals(36, bicycle.currentSpeed());
    }
    @Test
    public void shouldStop() {

        Bicycle bicycle = new RoadBike();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());
    }

}
