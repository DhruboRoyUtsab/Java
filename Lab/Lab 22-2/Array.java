import java.util.Scanner;

 public class Array{
	 public static void main(String[] args){
		 Scanner Input = new Scanner(System.in);
		 System.out.println("Enter the size: ");
		 
		 int size = Input.nextInt();
		 int [] arr = new int[size];
		
		System.out.println("Enter the element: ");
		 for(int i = 0; i<size; i++){
			 arr[i] = Input.nextInt();
		 }
		
		System.out.println("Array: ");
		for(int i = 0; i<size; i++){
		System.out.print(	 arr[i] + "  ");
		
		}
		
		//Largest
		System.out.print("\nLargest Element: \n" );
			int largest = arr[0];
			for(int i = 0; i<size; i++){
			if(arr[i]>largest){
			largest = arr[i];
			}
		}
		System.out.print(largest);
		
		//Lowest
		System.out.println("\nLowest Element: " );
		int lowest = arr[0];
		for(int i = 0; i<size; i++){
		if(arr[i]<lowest){
		lowest = arr[i];
			}
		}
		System.out.println(lowest);
		
		//Reverse
		for(int i = size-1; i>= 0; i--){
		System.out.print(	 arr[i] + "  ");
		}
		
		//Sorting
		System.out.println("\nSortin Order: ");
		for(int i = 0; i<size; i++){
			for(int j = i+1; j<size; j++){
				if(arr[i]> arr[j]){
				int temp;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i<size; i++){
			System.out.print(arr[i] + " ");
		}
		
		//Descending Sorting
		System.out.println("\nDescending Sorting Order: ");
		for(int i = 0; i<size; i++){
			for(int j = i+1; j<size; j++){
				if(arr[i]< arr[j]){
				int temp;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i<size; i++){
			System.out.print(arr[i] + " ");
		}
	
	}
	
 }
		
