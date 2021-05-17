package bicycles.models;


import bicycles.Bicycle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TandemTest {
    @Test
    public void shouldAccelerate() {

        Bicycle bicycle = new Tandem();
        bicycle.accelerate();
        assertEquals(12, bicycle.currentSpeed());
    }
    @Test
    public void shouldAccelerateAndBrake() {

        Bicycle bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(5, bicycle.currentSpeed());
    }
    @Test
    public void multipleAccelerationsAndBrake() {

        Bicycle bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();

        assertEquals(34, bicycle.currentSpeed());
    }
    @Test
    public void shouldStop() {

        Bicycle bicycle = new Tandem();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());
    }

}
