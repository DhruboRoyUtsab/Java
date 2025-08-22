public class AirTransporter{
    private String manuFacturer;
    private double maxAltitude;
    private double maxSpeed;

    public AirTransporter(){

    }
    public AirTransporter(String manuFacturer, double maxAltitude, double maxSpeed){
        this.manuFacturer = manuFacturer;
        this.maxAltitude = maxAltitude;
        this.maxSpeed = maxSpeed;
    }

    public void setManuFacturer(String manuFacturer){
        this.manuFacturer = manuFacturer;
    }
    public void setMaxAltitude(double maxAtitude){
        this.maxAltitude = maxAtitude;
    }
    public void setMaxSpeed(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public String getmanuFacturer(){
        return manuFacturer;
    }
    public double getmaxAtitude(){
        return maxAltitude;
    }
    public double getmaxSpeed(){
        return maxSpeed;
    }

    public void Details(){
        System.out.println("Manufacturer: " + manuFacturer);
        System.out.println("Max Atitude: " + maxAltitude);
        System.out.println("Max Speed: " + maxSpeed);
        
    }
        
}