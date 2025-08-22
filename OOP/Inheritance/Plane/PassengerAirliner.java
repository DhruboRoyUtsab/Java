public class PassengerAirliner extends AirTransporter{
    private int PassengerCapacity;

    public PassengerAirliner(){

    }
    public PassengerAirliner(String manuFacturer, double maxAtitude, double maxSpeed, int PassengerCapacity){
        super(manuFacturer, maxAtitude, maxSpeed);
        this.PassengerCapacity = PassengerCapacity;

    }

    public void setPassengerCapacity(int PassengerCapacity){
        this.PassengerCapacity = PassengerCapacity;
    }
    public int getPassengerCapacity(){
        return PassengerCapacity;
    }

    public void Details(){
        super.Details();
        System.out.println("Passenger Capacity: " + PassengerCapacity);
        
    }
        
}