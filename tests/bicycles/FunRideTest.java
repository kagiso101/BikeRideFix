package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    @Test
    public void acceptsRoadBike(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new RoadBike();
        takeARide.accept(bicycle);
        assertEquals(1, takeARide.getEnteredCount());
    }
    @Test
    public void acceptsMountainBike(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new MountainBike();
        takeARide.accept(bicycle);
        assertEquals(1, takeARide.getEnteredCount());
    }
    @Test
    public void acceptsTandem(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new Tandem();
        takeARide.accept(bicycle);
        assertEquals(1, takeARide.getEnteredCount());
    }
}
