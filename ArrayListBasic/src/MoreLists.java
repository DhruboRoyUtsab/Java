import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items ={"Apples", "Bananas","Milk","Eggs"};
        List<String> list = List.of(items);
        System.out.println(list);
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yogurt");
        System.out.println(groceries);

        ArrayList <String> nextList = new ArrayList<>(
                List.of("Cheese","Beard","Cake")
        );
        System.out.println(nextList);
        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third Item: " + groceries.get(2));

        if(groceries.contains("Cake")){
            System.out.println("List contains Cake");
        }
        groceries.add("Yogurt");
        System.out.println("First = " + groceries.indexOf("Yogurt"));
        System.out.println("Last = " + groceries.lastIndexOf("Yogurt"));

        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("Yogurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("Apples","Eggs"));
        System.out.println(groceries);
        groceries.retainAll(List.of("Apples","Milk","Mustard","Cheese"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);

        System.out.println("isEmpty = " + groceries.isEmpty());

        groceries.addAll(List.of("Milk","Beard","Sugar","Butter","Cheese"));
        groceries.addAll(Arrays.asList("Eggs","Apples","Mustard","Pickles","Ham"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));

    }
}
