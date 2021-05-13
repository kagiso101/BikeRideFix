package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import bicycles.rides.FunRide;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {
    @Test
    public void acceptsMultipleBikes(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new RoadBike();
        Bicycle bicycle1 = new MountainBike();
        Bicycle bicycle2 = new Tandem();
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        takeARide.accept(bicycle2);
        takeARide.accept(bicycle1);
        takeARide.accept(bicycle1);
        assertEquals(5, takeARide.getEnteredCount());
    }
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
    @Test
    public void getCounterForOneMountainBike(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new MountainBike();
        takeARide.accept(bicycle);
        assertEquals(1, takeARide.getEnteredCount());
    }

    @Test
    public void getCounterForMultipleMountainBike(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new MountainBike();
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        assertEquals(3, takeARide.getEnteredCount());
    }
    @Test
    public void getCounterForOneTandem(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new Tandem();
        takeARide.accept(bicycle);
        assertEquals(1, takeARide.getEnteredCount());
    }
    @Test
    public void getCounterForMultipleTandems(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new Tandem();
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        assertEquals(3, takeARide.getEnteredCount());
    }
    @Test
    public void getCounterForOneRoadBike(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new RoadBike();
        takeARide.accept(bicycle);
        assertEquals(1, takeARide.getEnteredCount());
    }
    @Test
    public void getCounterForMultipleRoadBikes(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new RoadBike();
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        assertEquals(5, takeARide.getEnteredCount());
    }
    @Test
    public void getCounterForDifferentTypes(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new RoadBike();
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        assertEquals(3, takeARide.getCountForType(BicycleType.RoadBike));
    }
}
