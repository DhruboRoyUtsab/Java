class Car {

    private String model;
    private Engine engine;
 
    // Constructor
    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }
 
    // Getter for model
    public String getModel() {
    return model;
    }
 
    // Getter for engine
    public Engine getEngine() {
    return engine;
    }
 
    public void display() {
    System.out.println("Car Model: " + model);
    engine.display();
    }

}
 
class Engine {

    private String type;
 
    // Constructor
    public Engine(String type) {
    this.type = type;  
    }
 
    // Getter for type

    public String getType() {
     return type;
    }
 
    public void display() {
    System.out.println("Engine Type: " + type);
    }

}
 
public class Composition {

    public static void main(String[] args) {
    Engine engine = new Engine("V8");
    Car car = new Car("BMW", engine);
 
        // Now, car "has-a" engine.
    engine.display();

    System.out.println("------------");
    car.display();

    }
}
