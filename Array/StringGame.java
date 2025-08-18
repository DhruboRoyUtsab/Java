public class StringGame {
public static void main(String[] args) {
    String s1 = "Utsab";
    String s2 = new String();
    String s3 = new String("Dhrubo Roy ");
    String s4 = "The Game was very enjoyable";
    String s5 = new String(" HAHA");
    String s6 = "JaVa ClaSS";
    String s7 = "Utsab";
    String s8 = "Utiab";


    //EMPTY LENGTH CHART AT CONCAT UPPER LOWER EQUALS SUBSTRING
    
    System.out.println("Empty: " +s1.isEmpty());// Boolean type isEmpty 
    System.out.println("Empty: " + s2.isEmpty());
    System.out.println("Length: " + s4.length());
    System.out.println("Char at: " + s4.charAt(4));
    System.out.println("Concat: " + s3.concat(s1));
    System.out.println("Lowercase: " + s5.toLowerCase());
    System.out.println("Uppercase: " + s6.toUpperCase());
    System.out.println("Equals: " + s1.equals(s7));
    System.out.println("Equals: " + s1.equals(s8));
    System.out.println("Equals: " + s1.equals(s6));
    System.out.println("Substring: " + s4.substring(4, 8));
    }    
}
