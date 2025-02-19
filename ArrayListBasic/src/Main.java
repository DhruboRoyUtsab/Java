import java.util.ArrayList;
import java.util.Arrays;

record GroceryItems(String name, String  type, int count){
    public GroceryItems(String name){
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s",count,name.toUpperCase(),type);
    }
}
public class Main {
    public static void main(String[] args) {
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItems("Milk");
        groceryArray[1] = new GroceryItems("Apples", "PRODUCE", 6);
        groceryArray[2] = "5 oranges";
        System.out.println(Arrays.toString(groceryArray));

        ArrayList ObjectList = new ArrayList();
        ObjectList.add(new GroceryItems("Butter"));
        ObjectList.add("Yogurt");

        ArrayList <GroceryItems> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItems("Butter"));
        groceryList.add(new GroceryItems("Milk"));
        groceryList.add(new GroceryItems("Oranges","PRODUCE",5));
        groceryList.set(0,
                new GroceryItems("Mango", "PRODUCE",6));
        groceryList.remove(1);
        System.out.println(groceryList);


    }

}