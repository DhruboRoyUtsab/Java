public class App {
    public static void main(String[] args) throws Exception {
    Car car = new Car();
    


    car.setMake("Porsche");
    car.setModel ( " Carrera");
    car.setDoors(2);
    car.setConvertible(true);
    car.setColor( "black");
    
    System.out.println("make = "+ car.getMake());
    System.out.println( "model = "+ car.getModel());
    car.describeCar() ;
    }
}
