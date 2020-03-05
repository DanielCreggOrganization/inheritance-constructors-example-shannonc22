public class Bicycle {

	// the Bicycle class has three fields
	private int cadence;
	private int gear;
	private int speed;
	
	// Default constructor
    public Bicycle(){
         cadence = 0;
	     gear = 0;
         speed = 0;
        System.out.println("I just created a bicycle");
    }
	// Parameterised constructor
	public Bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
        System.out.println("I just created a bicycle");
	}
	
	// Getters and Setters here
   public int getCadence(){
        return cadence;
    }

    public void setCadence(int cadence){
        this.cadence = cadence;
   }

   public int getGear(){
       return gear;
   }

   public void setGear(int gear){
       this.gear = gear;
   }

   public int getSpeed(){
       return speed;
   }

   public void setSpeed(int speed){
       this.speed = speed;
   }
	// Extra methods here
	public void applyBrake(int speedDecrement) {
        //speed -= speedDecrement;
        speed = speed - speedDecrement;
	}

	public void speedUp(int speedIncrement) {
        speed = speed - speedIncrement;

		// Your code here
	}

}
