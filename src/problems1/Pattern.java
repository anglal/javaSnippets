package problems1;

import java.util.Scanner;

class Patterns {
	// 1.
	public static void pattern1(int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	// 2
	public static void pattern2(int n) {
		for (int i = n; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	// 3
	public static void pattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	// 4
	public static void pattern4(int n) {
		for (int i = 0; i < 5; i++) {
			System.out.print("@ ");
		}
		System.out.println();
		for (int i = 1; i < n - 2; i++) {
			System.out.print("@ ");
			for (int j = 1; j < 5 - 1; j++) {
				System.out.print("  ");
			}
			System.out.print("@ ");
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			System.out.print("@ ");
		}
		System.out.println();
	}

	// 5
	public static void pattern5(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	// 6
	public static void pattern6(int n) {
		for (int j = 0; j < n; j++) {
			for (int i = 1; i <= 5; i++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

	// 7
	public static void pattern7(int n, int m) {
		int num = 1;
		for (int i = 0; i < n / m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

	// 8 Odd Numbers
	public static void pattern8(int n, int m) {
		int counter = 1;
		for(int i = 1; i <=n; i++) {
			if(i % 2 != 0){
				System.out.print(i + " ");
				if(counter % 5 == 0) {
					System.out.println();
				}
				counter++;
			}
		}
	}

	// 9 Even Numbers
	public static void pattern9(int n, int m) {
		int counter = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				if (counter % m == 0) {
					System.out.println();
				}
				counter++;

			}

		}

	}
	
	// 10 
	public static void pattern10(char input) {
		int counter = 1;
		for(int i = 'a'; i <= input ; i++) {
			System.out.print((char)i + " ");
			if(counter % 5 == 0) {
				System.out.println();
			}
			counter++;
		}
	}
	
	// 11)	Write a program to check if a given number is Positive, Negative, or Zero.
	public static void findPositive(int x) {
		if(x > 0) {
			System.out.println("Then number is positive");
		}else if(x == 0) {
			System.out.println("The number is zero");
		}else {
			System.out.println("The number is negative");
		}
	}
	
	// 12) Write a program to check if a given number is odd or even.
	public static void findOdd(int data) {
		if(data % 2 == 0) {
			System.out.println("The number is even.");
		}else {
			System.out.println("The number is odd.");
		}
	}
	// 13) Write a program to check if the program has received command line arguments or not. If the program has not received 
	//	the values then print "No Values", else print all the values in a single line separated by ,(comma). Eg1) 
	//	java Example O/P: No values Eg2) java Example Mumbai Bangalore O/P: Mumbai,Bangalore [Note: You can use length property 
	//	of an array to check its length
	public static void checkCommandLine() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter words");
		String input = scanner.nextLine();
		if(input.isBlank()) {
			System.out.println("No inputs received");
		}else {
			String[] inputs = input.split("\\s+");
			for(int i = 0; i< inputs.length; i++) {
				System.out.print(inputs[i]);
				if(i < inputs.length -1) {
					System.out.print(", ");
				}
			}
		}
		
		scanner.close();
	}
}

public class Pattern {

	public static void main(String[] args) {
//		System.out.println("\n-----------------------------------------------");
////		1. 
//		Patterns.pattern1(3,5);
//		System.out.println("\n-----------------------------------------------");
////		2.
//		Patterns.pattern2(4);
//		System.out.println("\n-----------------------------------------------");
////		3.
//		Patterns.pattern3(5);
//		System.out.println("\n-----------------------------------------------");
////		4
//		Patterns.pattern4(7);
//		System.out.println("\n-----------------------------------------------");
////		5
//		Patterns.pattern5(5);
//		System.out.println("\n-----------------------------------------------");
////		6
//		Patterns.pattern6(5);
//		System.out.println("\n-----------------------------------------------");
////		7
//		Patterns.pattern7(50, 5);
//		System.out.println("\n-----------------------------------------------");
////		8 Odd numbers
//		Patterns.pattern8(50, 5);
//		System.out.println("\n-----------------------------------------------");
////		9 Even numbers
//		Patterns.pattern9(50, 5);
//		System.out.println("\n-----------------------------------------------");
////		10
//		Patterns.pattern10('z');
//		System.out.println("\n-----------------------------------------------");
////		11
//		Patterns.findPositive(1222);
//		System.out.println("\n-----------------------------------------------");
////		12
//		Patterns.findOdd(9);
//		System.out.println("\n-----------------------------------------------");
////		13
//		Patterns.checkCommandLine();
//		System.out.println("\n-----------------------------------------------");

	}

}
