import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();

        inFlight(flier);
        inFlight(new Jet());
        Trackable truck = new Truck();
        truck.track();
        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n",kmsTraveled,milesTraveled);

        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFlies = new LinkedList<>();
        betterFlies.add(bird);

        triggerFlies(fliers);
        flyFlies(fliers);
        landFlies(fliers);

        triggerFlies(betterFlies);
        flyFlies(betterFlies);
        landFlies(betterFlies);

    }
    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }
    private static void triggerFlies(List<FlightEnabled> fliers){
        for (var flier: fliers){
            flier.takeOff();
        }
    }
    private static void flyFlies(List<FlightEnabled> fliers){
        for (var flier: fliers){
            flier.fly();
        }
    }
    private static void landFlies(List<FlightEnabled> fliers){
        for (var flier: fliers){
            flier.land();
        }
    }
}