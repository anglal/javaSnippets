package problems1;

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

}

public class Pattern {

	public static void main(String[] args) {
		System.out.println("\n-----------------------------------------------");
//		1. 
		Patterns.pattern1(3,5);
		System.out.println("\n-----------------------------------------------");
//		2.
		Patterns.pattern2(4);
		System.out.println("\n-----------------------------------------------");
//		3.
		Patterns.pattern3(5);
		System.out.println("\n-----------------------------------------------");
//		4
		Patterns.pattern4(7);
		System.out.println("\n-----------------------------------------------");
//		5
		Patterns.pattern5(5);
		System.out.println("\n-----------------------------------------------");
//		6
		Patterns.pattern6(5);
		System.out.println("\n-----------------------------------------------");
//		7
		Patterns.pattern7(50, 5);
		System.out.println("\n-----------------------------------------------");
//		8 Odd numbers
		Patterns.pattern8(50, 5);
		System.out.println("\n-----------------------------------------------");
//		9 Even numbers
		Patterns.pattern9(50, 5);
		System.out.println("\n-----------------------------------------------");
//		10
		Patterns.pattern10('z');
		System.out.println("\n-----------------------------------------------");

	}

}
