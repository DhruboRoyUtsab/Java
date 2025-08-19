	class Book{
private String authorName;
private double price;
private int serialNumber;
public Book(){}

public Book(String authorName, double price, int serialNumber){
	this.authorName = authorName;
	this.price = price;
	this.serialNumber = serialNumber;
	}
	public void setAuthorName(String authorName){
	this.authorName = authorName;
	}
	
	public void setPrice(double price){
	this.price = price;
	}
	public void setSerialNumber(int serialNumber){
	this.serialNumber = serialNumber;
	}
	public String getAuthorName(){
	return authorName;
	}
	
	public double getPrice(){
	return price;
	}
	public int getSerialNumber(){
	return serialNumber;
	}
	
	public void Display(){
		System.out.println("Author Name: " +  authorName);
		System.out.println("Price: $" + price);
		System.out.println("Serial Number: " + serialNumber);

}
}

class Library{
int person_id;
Book books[];

public Library(){}
public Library(int person_id,int sizeofArray){
	this.person_id = person_id; 
	books =new Book[sizeofArray];
}
	public void setPersonID(int person_id){
	this.person_id = person_id;
	}
	public int getPersonID(){
	return person_id;
	}
	
	public void DisplayALL(){
		for(int i=0; i<books.length;i++){
			if(books[i]!= null){
				System.out.println("Person ID: " + person_id);
				books[i].Display();
				System.out.println();
			}
		}
	}
	
	public void InsertBook(Book book){
		int flag = 0;
		for(int i=0; i<books.length;i++){
			if(books[i]== null){
				books[i] = book;
				flag = 1;
				break;
			}
		}
		if(flag==1){
			System.out.println("Inserted");
		}
		else{
			System.out.println("Not Inserted");
		}
	}
	public void RemoveBook(Book b){
		int flag = 0;
		for(int i=0; i<books.length;i++){
			if(books[i]== b){
				books[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag==1){
			System.out.println("Removed");
		}
		else{
			System.out.println("Can not removed");
		}
	}

	public void EmptySlot(){
		int count = 0;
		for(int i = 0;i<books.length;i++){
			if (books[i] == null){
				count++;
			}
		}
		if(count>0){
			System.out.println("Empty slot is " + count);

		}
		else{
			System.out.println("No slot available.");
		}
	}
	
}
public class LibrarySystem{
	public static void main(String[] args){
		Book b1 = new Book("Arthur Morgan", 600, 55);
		Book b2 = new Book("Jun Eishima", 150.75, 185);
		Book b3 = new Book("Eishima", 63.20, 190);
		
		Library l1 = new Library(5454, 4);
		
		l1.InsertBook(b1);
		l1.InsertBook(b2);
		l1.InsertBook(b3);
		System.out.println("-----------------------------");
		
		l1.DisplayALL();
		System.out.println("-----------------------------");
		
		l1.RemoveBook(b3);
		//l1.RemoveBook(b2);
		
		System.out.println("-----------------------------");
		l1.DisplayALL();
		
		System.out.println("-----------------------------");
		l1.EmptySlot();

	}
}
		
		