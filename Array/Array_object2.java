class Product{
    int id;
    String name;
    double amount;
    public Product(int id, String name, double amount){
        this.id = id;
        this.name = name;
        this.amount = amount;
    }
}
public class Array_object2{
    public static void main(String[] args){
        Product[] pr = new Product[3]; // Array of object 
        pr[0] = new Product(1, "Mouse", 500);
        pr[1] = new Product(2, "Key", 700);
        pr[2] = new Product(3, "Monitor", 1000);
        for(int i=0; i<pr.length; i++){
            System.out.println("Name is: "+pr[i].name + " Id is :" +pr[i].id+ " amount is: "+pr[i].amount);
        }
    }
} 