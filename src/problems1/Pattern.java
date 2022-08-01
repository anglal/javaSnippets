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
				if(counter % m == 0) {
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
	
	// 14) Initialize two character variables in a program and display the characters in alphabetical order. Eg1) 
	//	if first character is s and second is e O/P: e,s Eg2) if first character is a and second is e O/P:a,e
	public static void alphaOrder(char first, char second) {
		if(first < second) {
			System.out.print(first);
			System.out.print(",");
			System.out.println(second);
		}else {
			System.out.print(second);
			System.out.print(",");
			System.out.println(first);
		}
	}
	
	// 15) Intialize a character variable in a program and if the value is alphabet then print "Alphabet" if it’s a number 
	// then print "Digit" and for other characters print "Special Character"
	
	public static void identifier(char input) {
		
		if((input >= 'a' && input <= 'z') || (input <= 'Z' && input >= 'A') ) {
			System.out.println("It is an alphabet");
		}else if(input >= 48 && input <= 57) {
			System.out.println("It is a digit");
			
		}else {
			System.out.println("It is neither alphabet nor digit. It chould be special character");
		}
	
	}
	
	// 16) Write a program to accept gender ("Male" or "Female") and age (1-120) from command line arguments and print the percentage of 
	//	interest based on the given conditions. 
	//  Interest == 8.2% Gender ==> Female Age ==>1 to 58 
	//  Interest == 7.6% Gender ==> Female Age ==>59 -120 
	//	Interest == 9.2% Gender ==> Male Age ==>1-60 
	//  Interest == 8.3% Gender ==> Male Age ==>61-120
	public static void acceptGender(String gender, int age) {
		if(gender == "F" ){
			if(age >= 1 && age <= 58) {
			System.out.println("Interest : 8.2%.");
			}else if(age >= 59 && age <= 120){
			System.out.println("Interest : 7.6%.");
			}else {
				System.out.println("Wrong input.");
			}
		} else if(gender == "M") {
			if(age >= 1 && age <= 60) {
				System.out.println("Interest : 9.2%.");
			}else if(age >= 61 && age <= 120) {
				System.out.println("Interest : 8.3%");
			}else {
				System.out.println("Wrong input");
			}
		}
	}
	
	// 17) Write a program to convert from upper case to lower case and vice versa of an alphabet and print the old character and 
	// new character as shown in example (Ex: a->A, M->m).
	public static void convertCase(char input) {
		System.out.print(input + " -> ");
		if(input >= 'a' && input <='z') {
			input += 'A'-'a';
		}else {
			input -= 'A'-'a';
		}
		System.out.print(input);
	}
	
	// 18) Write a program to print the color name, based on color code. If color code in not valid then print "Invalid Code". 
	// R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
	public static void printColor(char input) {
		
		switch(input) {
		case 'R':
			System.out.println("R -> Red");
			break;
		case 'B':
			System.out.println("B -> Blue");
			break;
		case 'G':
			System.out.println("G -> Green");
			break;
		case 'O':
			System.out.println("O -> Orange");
			break;
		case 'Y':
			System.out.println("Y -> Yellow");
			break;
		case 'W':
			System.out.println("W -> White");
			break;
		default:
			System.out.println("Invalid Code");
		}
	}
	
	// 19) Write a program to print month in words, based on input month in numbers
	public static void printMonth() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a month:");
		int month = scanner.nextInt();
		scanner.nextLine();
		switch(month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
				System.out.println("Enter a number between 1 and 12.");
		}
		scanner.close();
	}
	
	// 20) Write a program to print numbers from 1 to 10 in a single row with one tab space.
	public static void printNum(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.print(i +"\t");
		}
	}
	
	// 21) Write a program to print even numbers between 23 and 57, each number should be printed in a separate row.
	public static void printEven(int n, int m) {
		for(int i = n; i <= m; i++) {
			if( i%2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	// 22) Write a program to check if a given number is prime or not
	public static boolean ifPrime(int data) {
		if(data <= 1) {
			System.out.println("Invalid input. It should be greater 1");
			System.exit(1);
		}
		for(int i = 2; i <= data/2; i++) {
			if(data % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	// 23) Write a program to print prime numbers between 10 and 99.
	public static void printPrime(int m, int n) {
		outerloop:
		for(int i = m; i < n; i++) {
			if( i <= 1) {
				continue;
			}
			
			for(int j = 2; j <= i/2; j++) {
				if(i%j == 0) {
					continue outerloop;
				}
			}
			System.out.println(i);
			
		}
	}
	
	// 24) Write a program to add all the values in a given number and print. Ex: 1234->10
	public static void addAll(int n) {
		int sum = 0;

		
		//0123410
		while(n != 0) {
			int remainder = n%10;
			sum +=  remainder;
			n /= 10;
		}
		System.out.println(sum);
	}
	
	// 25) Write a program to print * in Floyds format (using for and while loop) *
	public static void floydFormat(int n) {
		// Using for loop
		for( int i  = 1; i <= n; i++) {
			for(int j = 1; j <= i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		//Using while loop
		int i = 1;
		while(i <= n) {
			int j = 1;
			while(j <= i) {
				System.out.print(" *");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	// 26) Write a program to reverse a given number and print Eg1) 
	// I/P: 1234 O/P:4321 Eg2) I/P:1004 O/P:4001
	public static int reverse(int data) {
		String reversed = "";
		while(data != 0) {
			reversed += data % 10;
			data /= 10;
		}
		return Integer.valueOf(reversed);
	}
	
	// 27) Write a Java program to find if the given number is palindrome or not
	public static void checkPal(int data) {
		int reversed = 0;
		int data1 = data;
		while(data != 0) {
			reversed = reversed * 10 + data % 10;
			data /= 10;
		}
		if(reversed == data1) {
			System.out.println("It is pallindrome.");
		}else {
			System.out.println("It is not pallindrome.");
		}
	}
	
	// 28) Write a program to print first 5 values which are divisible by 2, 3, and 5.
	public static void printVals() {
		int counter = 0;
		int num = 1;
		
		while(true)
		{
			if(num % 2 == 0 && num % 3 ==0 && num % 5 ==0) {
				System.out.println(num);
				counter++;
				if(counter % 5 == 0) {
					break;
				}
			}
			num++;
		}
//		for(int i = 0; i <= 500; i++) {
//			if(i % 2 == 0 && i % 3 == 0 && i%5 == 0) {
//				System.out.println(i);
//				counter ++;
//				if(counter % 5 == 0) {
//					break;
//				}
//			}
//		}
	}
	
	// 20) Write a program that displays a menu with options 1. Add 2. Sub Based on the options chosen, 
	// read 2 numbers and perform the relevant operation. After performing the operation, the program should 
	// ask the user if he wants to continue. If the user presses y or Y, then the program should continue displaying 
	// the menu else the program should terminate. [ Note: Use Scanner class, you can take help from the trainer regarding the same ]
	public static void displayMenu() {
		String cont = "";
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter 1 to add:\nEnter 2 to subtact:\n");
			int input = scanner.nextInt();
			scanner.nextLine();
			int first, second = 0;
			if(input == 1) {
				System.out.println("Enter the first number:");
				first = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter the second number:");
				second = scanner.nextInt();
				scanner.nextLine();
				System.out.println("The sum is: " + (first + second)+'.');
				System.out.println("Continue?");
				cont = scanner.next().toLowerCase();
				scanner.nextLine();
				
				
			}else if(input == 2) {
				System.out.println("Enter the first number:");
				first = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter the second number:");
				second = scanner.nextInt();
				scanner.nextLine();
				System.out.println("The difference is: " + (first - second)+'.');
				System.out.println("Continue?");
				cont = scanner.next().toLowerCase();
				scanner.nextLine();
			}
				
		}while(cont.equals("y"));
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
//		Patterns.pattern8(100, 10);
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
//		if(args.length == 0) {
//			System.out.println("no arguments");
//		}else {
//			for(int i = 0; i < args.length; i++) {
//				System.out.print(args[i]);
//				if(i < args.length) {
//					System.out.print(", ");
//				}
//			}
//		}
//		System.out.println("\n-----------------------------------------------");
////		14
//		Patterns.alphaOrder('z', 'b');
//		System.out.println("\n-----------------------------------------------");
////		15
//		Patterns.identifier('9');
//		System.out.println("\n-----------------------------------------------");
////		16
//		Patterns.acceptGender("F", 121);
////		17
//		Patterns.convertCase('z');
//		System.out.println("\n-----------------------------------------------");
		
////		18
//		Patterns.printColor('n');
//		System.out.println("\n-----------------------------------------------");
////		19
//		Patterns.printMonth();
//		System.out.println("\n-----------------------------------------------");
		
////		20
//		Patterns.printNum(10);
//		System.out.println("\n-----------------------------------------------");
		
////		21)
//		Patterns.printEven(2, 57);
//		System.out.println("\n-----------------------------------------------");
		
////		22)
//		System.out.println(Patterns.ifPrime(4));
//		System.out.println("\n-----------------------------------------------");
		
////		23)
//		Patterns.printPrime(2, 99);
//		System.out.println("\n-----------------------------------------------");
		
////		24)
//		Patterns.addAll(123410);
//		System.out.println("\n-----------------------------------------------");
		
////		25) 
//		Patterns.floydFormat(5);
//		System.out.println("\n-----------------------------------------------");
////		26)
//		System.out.println(Patterns.reverse(2001));
//		System.out.println("\n-----------------------------------------------");
////        27)
//		Patterns.checkPal(12321);
//		System.out.println("\n-----------------------------------------------");
////		28)
//      Patterns.printVals();
//		System.out.println("\n-----------------------------------------------");
//		28)
//		Patterns.displayMenu();
		
		
	}

}
