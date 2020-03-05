
/**
 * Main
 */
public class Main { 
    public static void main(String[] args) {

    //System.out.println("Hello");
    //Bicycle bicycleObject1 = new Bicycle();
    MountainBike mountainBikeObject1 = new MountainBike(1, 2, 3, 4);

    //System.out.println(bicycleObject1.cadence); 
    System.out.println(mountainBikeObject1.getGear());
    mountainBikeObject1.applyBrake(8);
    System.out.println(  mountainBikeObject1.getSpeed());
    }
}