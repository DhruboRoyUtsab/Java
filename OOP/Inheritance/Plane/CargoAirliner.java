public class CargoAirliner extends AirTransporter {
int maxCargoWeight;

public CargoAirliner(){}

public CargoAirliner(String manuFacturer, double maxAltitude, double maxSpeed,int maxCargoWeight){
    super(manuFacturer,maxAltitude, maxSpeed);
    this.maxCargoWeight = maxCargoWeight;
    }

void setmaxCargoWeight(int maxCargoWeight){
    this.maxCargoWeight = maxCargoWeight;
}
int getmaxCargoWeight(){
    return maxCargoWeight;
}
void showDetails(){
    super.Details();
    System.out.println("maxCargoWeight: " + maxCargoWeight);

}
}
