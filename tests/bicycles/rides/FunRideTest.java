package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {
    @Test
    public void acceptsMultipleBikesAndNotTakeDuplicates(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new RoadBike();
        Bicycle bicycle1 = new MountainBike();
        Bicycle bicycle2 = new Tandem();
        takeARide.accept(bicycle);
        takeARide.accept(bicycle);
        takeARide.accept(bicycle2);
        takeARide.accept(bicycle1);
        takeARide.accept(bicycle1);
        assertEquals(3, takeARide.getEnteredCount());
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
        Bicycle bicycle2 = new MountainBike();
        Bicycle bicycle3 = new MountainBike();
        takeARide.accept(bicycle);
        takeARide.accept(bicycle2);
        takeARide.accept(bicycle3);
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
        Bicycle bicycle2 = new Tandem();
        Bicycle bicycle3 = new Tandem();
        takeARide.accept(bicycle);
        takeARide.accept(bicycle2);
        takeARide.accept(bicycle3);

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
        Bicycle bicycle2 = new RoadBike();
        Bicycle bicycle3 = new RoadBike();
        Bicycle bicycle4 = new RoadBike();
        Bicycle bicycle5 = new RoadBike();
        takeARide.accept(bicycle);
        takeARide.accept(bicycle2);
        takeARide.accept(bicycle3);
        takeARide.accept(bicycle4);
        takeARide.accept(bicycle5);
        assertEquals(5, takeARide.getEnteredCount());
    }
    @Test
    public void getCounterForDifferentTypes(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new RoadBike();
        Bicycle bicycle2 = new RoadBike();
        Bicycle bicycle3 = new RoadBike();
        takeARide.accept(bicycle);
        takeARide.accept(bicycle2);
        takeARide.accept(bicycle3);
        assertEquals(3, takeARide.getCountForType(BicycleType.RoadBike));
    }
    @Test
    public void getCounterForMultipleBikes(){
        FunRide takeARide = new FunRide(8);
        Bicycle bicycle = new MountainBike();
        Bicycle bicycle2 = new Tandem();
        Bicycle bicycle3 = new RoadBike();
        Bicycle bicycle4 = new MountainBike();
        takeARide.accept(bicycle);
        takeARide.accept(bicycle2);
        takeARide.accept(bicycle3);
        takeARide.accept(bicycle4);
        assertEquals(4, takeARide.getEnteredCount());
    }
}
