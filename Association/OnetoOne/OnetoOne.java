public class OnetoOne {
   public static void main(String[] args){
    Address Ad = new Address("Shewrapara", 220, "Mirpur", 200);
    Student S = new Student("Utsab", 53492, 'M', Ad);
    S.Display();
   } 
}
