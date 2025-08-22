public class Plane{
        public static void main(String[] args){
        PassengerAirliner boeing747 = new PassengerAirliner("Boeing",45000,900,525);
        boeing747.Details();
        CargoAirliner Airbus24 = new CargoAirliner();
        Airbus24.setManuFacturer("AirBus");
        Airbus24.setMaxAltitude(35000);
        Airbus24.setMaxSpeed(700);
        Airbus24.setmaxCargoWeight(9000);
        Airbus24.showDetails();
        }
        }