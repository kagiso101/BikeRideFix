package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BicycleType;

import java.util.ArrayList;
import java.util.List;

public class FunRide {

    protected int maxBikes;
    private List<Bicycle> myList = new ArrayList<Bicycle>();

    public FunRide(int maxBikes) {
        this.maxBikes = maxBikes;
    }

    public String accept(Bicycle bicycle) {

        if (myList.size() < maxBikes && !myList.contains(bicycle)) {
            myList.add(bicycle);
            return "Added To the list";
        } else {
            return "Not added to the list";
        }
    }

    public int getCountForType(BicycleType bicycleType){
        int counter = 0;
        for (Bicycle bicycleType1 : myList){
            if(bicycleType1.bicycleTypes() == bicycleType){
                counter++;
            }
        }
        return counter;
    }

    public int getEnteredCount(){
        return myList.size();
    }


}

