public class AirTransporter {
    private String manufacturer;
    private double maxAltitude ;
    private double maxSpeed ;
    AirTransporter(){
        System.out.println("D-Constructor");
    }
    AirTransporter(String manufacturer , double maxAltitude , double maxSpeed){
        this.manufacturer = manufacturer;
        this.maxAltitude = maxAltitude ;
        this.maxSpeed = maxSpeed;
    }
    public void setmanufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public String getmanufacturer(){
        return this.manufacturer;
    }
    public void setmaxAltitude(double maxAltitude){
        this.maxAltitude = maxAltitude;
    }
    public double getmaxAltitude(){
        return this.maxAltitude;
    }
    public void setmaxSpeed(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public double getmaxSpeed(){
        return this.maxSpeed;
    }

    public void showDetails(){
        System.out.println("Manufacturer name : "+manufacturer);
        System.out.println("Max Altitude : "+maxAltitude);
        System.out.println("Max Speed : "+maxSpeed);
    }
    
}
