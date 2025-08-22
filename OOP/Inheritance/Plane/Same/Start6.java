public class Start6 {
    public static void main(String[] args){
        CargoAirliner a1 = new CargoAirliner();
        a1.setmanufacturer("Boeing");
        a1.setmaxAltitude(28289.0);
        a1.setmaxSpeed(8372);
        a1.setmaxCargoWeight(100);
        a1.showDetails();
        PassengerAirliner b1 = new PassengerAirliner();
        b1.setmanufacturer("Airliner");
        b1.setmaxAltitude(3545.0);
        b1.setmaxSpeed(350);
        b1.setPassengerCapacity(850);
        b1.showDetails();
    }
    
}
