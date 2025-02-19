import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Japan");
        placesToVisit.add("USA");
        placesToVisit.add(0, "Nepal");
        System.out.println(placesToVisit);

        addElement(placesToVisit);
        System.out.println(placesToVisit);

        printTrip(placesToVisit);
        printTrip2(placesToVisit);
        printTrip3(placesToVisit);

        gettingElement(placesToVisit);

        removeElement(placesToVisit);
        System.out.println(placesToVisit);


    }

    private static void addElement(LinkedList<String> list) {
        list.addFirst("Russia");
        list.addLast("Mexico");
        list.offer("China");
        list.offerFirst("Canada");
        list.offerLast("India");
        list.push("Rome");
    }

    private static void removeElement(LinkedList<String> list) {
        list.remove(6);
        list.remove("China");

        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");

        String p1 = list.poll();
        System.out.println(p1 + " was removed");

        String p2 = list.pollFirst();
        System.out.println(p2 + " was removed");

        String p3 = list.pollLast();
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop(); // removes first element
        System.out.println(p4 + " was removed");

    }

    private static void gettingElement(LinkedList<String> list) {
        System.out.println("Retrieved element = " + list.get(4));

        System.out.println("Retrieved First element = " + list.getFirst());
        System.out.println("Retrieved Last element = " + list.getLast());
        System.out.println("Japan is at position  = " + list.indexOf("Japan"));
        System.out.println("Rome is at position = " + list.lastIndexOf("Rome"));
        System.out.println("Element from element: " + list.element());

        System.out.println("Element from peek: " + list.peek());
        System.out.println("Element from Firstpeek: " + list.peekFirst());
        System.out.println("Element from Lastpeek: " + list.peekLast());

    }

    private static void printTrip(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());

        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());

    }

    private static void printTrip2(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previusTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From " + previusTown + " to " + town);
            previusTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());

    }

    private static void printTrip3(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previusTown = list.getFirst();

        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From " + previusTown + " to " + town);
            previusTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());

    }
}