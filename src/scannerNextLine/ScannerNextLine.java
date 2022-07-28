package scannerNextLine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerNextLine {
public static void main(String ... args){
	// nextLine consumes whole input including "\n"
	// others consume everything but "\n"
	// when hitting "enter" "\n" will be trailing and that will be consumed by next scanner
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter 1 to add student\nEnter 2 to display students\nEnter 3 to exit the application");
	
	int input = scanner.nextInt();
	scanner.nextLine();
	List<Student> students = new ArrayList<Student>();
	if(input == 3) {
		System.out.println("Thank you for using our application");
		System.exit(0);
	}
	while(input != 3) {
		switch(input) {
		case 1:
			System.out.println("How many students?");
			int number = scanner.nextInt();
			scanner.nextLine();
			for(int i = 0; i < number; i++) {
				System.out.println("Enter the name of the student");
				String name = scanner.nextLine();
				System.out.println("Enter id");
				int id = scanner.nextInt();
				scanner.nextLine();
				students.add(new Student(id, name));
			}
			System.out.println("Enter 1 to add student\nEnter 2 to display students\nEnter 3 to exit the application");
			input = scanner.nextInt();
			scanner.nextLine();
				break;
		case 2:
			if(students.isEmpty()) {
				System.out.println("There are no students");
				System.out.println("Enter 1 to add student\nEnter 2 to display students\nEnter 3 to exit the application");
				input = scanner.nextInt();
				scanner.nextLine();
			}
			else {
				students.forEach(System.out::println);
				System.out.println("Enter 1 to add student\nEnter 2 to display students\nEnter 3 to exit the application");
				input = scanner.nextInt();
				scanner.nextLine();
			}
				break;
		default:
				System.out.println("Enter 1 or 2 or 3");
				input = scanner.nextInt();
				scanner.nextLine();
		
			
		}
	}
	
	scanner.close();
	
}
}
class Student{
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	
}