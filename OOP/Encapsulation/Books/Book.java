public class Book{
    private String isbn;
    private String Booktitle;
    private String authorName;
    private double price;
    private int availableQuantity;
    
    public Book(String isbn,String Booktitle,String authorName,double price,int availableQuantity){
        this.isbn = isbn;
        this.Booktitle = Booktitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }
    public Book(){

    }

    public void setisbn(String isbn){
        this.isbn = isbn;
    }
    public void setBooktitle(String Booktitle){
        this.Booktitle = Booktitle;
    }
    public void setauthorName(String authorName){
        this.authorName = authorName;
    }
    public void setprice(double price){
        this.price = price;
    }
    public void setavailableQuantity(int availableQuantity){
        this.availableQuantity = availableQuantity;
    }

    public String getisbn(String isbn){
        return this.isbn = isbn;
    }
    public String getBooktitle(String Booktitle){
        return this.Booktitle = Booktitle;
    }
    public String getauthorName(String authorName){
        return this.authorName = authorName;
    }
    public double getprice(double price){
        return this.price = price;
    }
    public int getavailableQuantity(int availableQuantity){
        return this.availableQuantity = availableQuantity;
    }
    void addQuantity(int amount){
        this.availableQuantity += amount;
    }
    void sellQuantity(int amount){
        if(amount <= this.availableQuantity){
            this.availableQuantity -= amount;
        }
        else{
            System.out.println("Sorry. Out of Stock.");
        }
    }
    void showDetails(){
        System.out.println("Code: " + isbn +", Booktitle: " + Booktitle + ", Author Name: " + authorName + ", Price: $" + price);
        System.out.println("Available: " + availableQuantity);
    }



}