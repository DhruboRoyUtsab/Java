class Info {
    String Name;
    int Id;
    double Gpa;
    char C;

    
}

public class ArrayofOb {
    public static void main(String[] args) {
        
    
    Info S1 = new Info();
    
    S1.Name = "Utsab";
    S1.Id = 492;
    S1.Gpa = 3.75;
    S1.C = 'U';

    Info [] Pr = new Info[1];
    Pr[0] = S1;

    for(int i =0;i<Pr.length; i++){
        System.out.println("Name: " + Pr[i].Name + " ID: " +Pr[i].Id + " Gpa: " + Pr[i].Gpa +  " Character: " + Pr[i].C);

    
    }
}
    
}
