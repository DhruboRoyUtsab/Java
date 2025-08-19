public class Stadium {
    int Height;
    int Width;

    public Stadium(int Height, int Width) {
        this.Height = Height;
        this.Width = Width;
    } 
    public void CalculateArea(){
        double Area =  Height*Width;
    System.out.println("Area of Lord's Stadium: " + Area  + " squaree meters");
    }  
    
}
