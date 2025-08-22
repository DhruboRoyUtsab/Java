class StoryBook {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;
    private String category;
    // private static double discountRate = 0.1; // default discount rate

    // default constructor
    public StoryBook() {

    }

    // constructor with parameters
    public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
        this.category = category;
    }

    // static method to set discount rate
    // public static void setDiscountRate(double rate) {
    //     discountRate = rate;
    // }

    // static method to get discount rate
    // public static double getDiscountRate() {
    //     return discountRate;
    // }

    // method to set isbn
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // method to set book title
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    // method to set author name
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    // method to set price
    public void setPrice(double price) {
        this.price = price;
    }

    // method to set available quantity
    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    // method to set category
    public void setCategory(String category) {
        this.category = category;
    }

    // method to get isbn
    public String getIsbn() {
        return isbn;
    }

    // method to get book title
    public String getBookTitle() {
        return bookTitle;
    }

    // method to get author name
    public String getAuthorName() {
        return authorName;
    }

    // method to get price
    public double getPrice() {
        return price;
    }

    // method to get available quantity
    public int getAvailableQuantity() {
        return availableQuantity;
    }

    // method to get category
    public String getCategory() {
        return category;
    }

    // method to add quantity
    public void addQuantity(int amount) {
        this.availableQuantity += amount;
    }

    // method to sell quantity
    public void sellQuantity(int amount) {
        if (amount <= this.availableQuantity) {
            this.availableQuantity -= amount;
        } else {
            System.out.println("Not enough quantity in stock");
        }
    }

    // method to show details
    public void showDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author Name: " + authorName);
        System.out.println("Price: " + price);
        System.out.println("Available Quantity: " + availableQuantity);
        System.out.println("Category: " + category);
        // System.out.println("Discount Rate: " + getDiscountRate());
    }
}
public class StoryBookMain {
    public static void main(String[] args) {
        StoryBook book = new StoryBook("12345", "The Great Adventure", "J.K. Rowling", 25.5, 10, "Fiction");

        System.out.println("Original Details:");
        book.showDetails();

        //System.out.println("\nSetting new discount rate:");
        // book.setDiscountRate(0.2);
        //  System.out.println("New Discount Rate: " + getDiscountRate());

        System.out.println("\nAdding quantity:");
        book.addQuantity(5);
        //System.out.println("New Available Quantity: " + book.getAvailable.

    }
}