public class StringDemo {
    public static void main(String[] args) {
        String s1 = "HELLO ";
        String s2 = new String();
        String s3 = new String(" Utsab");
        String s4 = "Hel";
        String s5 = new String("Heey");
        String s6 = "Hi";
        String s8 = new String("JaVaClAss");

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s1.length());
        System.out.println(s3.charAt(1));
        System.out.println(s1.concat(s3));
        System.out.println(s1);
        System.out.println(s3);

        if(s2==s1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        if(s3==s5){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        if(s3.equals(s5)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        String s7 = s1.substring(2, 7);
        System.out.println(s7);
        System.out.println(s1);
        System.out.println("Uppercase: " + s4.toUpperCase());
        System.out.println("Lowercase: " + s6.toLowerCase());
        
        s1 = s1.substring(3,7);
        System.out.println(s1);
        s8 = s8.toLowerCase();
        System.out.println(s8);

    }
}
