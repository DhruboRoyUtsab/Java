class Student {
    String name;
    int rollNumber;
    int []marks;
    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
	// Array declare syntax- 
	//int[] arr = new int[]{1,2,3}
	//float[] arr2 = new float[]{1.1,2.2,3.2}
}
 
public class StudentManagementSystem {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = new Student[3]; // Array of object
 
        // Initialize students
        students[0] = new Student("Alice", 101, new int[]{90, 85, 95});
        students[1] = new Student("Bob", 102, new int[]{88, 92, 85});
        students[2] = new Student("Charlie", 103, new int[]{75, 80, 78});
 
        // Display all students
        for (int i=0; i<students.length; i++) {
            System.out.println("Name: " + students[i].name);
            System.out.println("Roll Number: " + students[i].rollNumber);
            System.out.println("Marks: " + students[i].marks[0] + ", " + students[i].marks[1] + ", " + students[i].marks[2]);
            System.out.println();
        }
 
    }
}