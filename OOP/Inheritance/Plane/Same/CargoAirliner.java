public class CargoAirliner extends AirTransporter {
    int maxCargoWeight;
    CargoAirliner(){

    }
    CargoAirliner(String manufacturer, double maxAltitude, double maxSpeed,int maxCargoWeight){
        super(manufacturer , maxAltitude , maxSpeed);
        this.maxCargoWeight = maxCargoWeight;
    }
public void setmaxCargoWeight(int weight){
    this.maxCargoWeight = weight;
}
int getmaxCargoWeight(){
    return maxCargoWeight;
}
public void showDetails(){
    super.showDetails();
    System.out.println("Max Cargo Weight : "+maxCargoWeight);
}
}
