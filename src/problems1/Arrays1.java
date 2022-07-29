package problems1;

class Answers {
//	1) Write a Java program to calculate the average value of array
	public static double findAverage(double[] arr) {
		int length = arr.length;
		double sum = 0;
		for (int i = 0; i < length; i++) {
			sum += arr[i];
		}
		return sum / length;
	}

//	2) Write a Java program to test if an array contains a specific value
	public static Boolean contains(int data, int[] arr) {
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			if (data == arr[i]) {
				return true;
			}
		}
		return false;
	}

//	3) Write a Java program to find the index of an array element
	public static int findIndexFromArray(int element, int[] arr) {
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			if (element == arr[i]) {
				return i;
			}
		}
		return -1;
	}

//	4) Write a Java program to remove a specific element from an array
	public static int[] removeElement(int element, int[] arr) {
		int l = arr.length;
		for (int i = 0; i < l; i++) {
			if (element == arr[i]) {
				for (int j = i; j < l - 1; j++) {
					arr[j] = arr[j + 1];
				}
				i--;
				l--;
			}
		}
		int[] answer = new int[l];
		for (int i = 0; i < l; i++) {
			answer[i] = arr[i];
		}

		return answer;
	}

//5) Write a Java program to find the maximum and minimum value of an  array

	public static int findMaxFromArray(int[] arr) {
		int max = arr[0];
		int l = arr.length;
		for (int i = 1; i < l; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int findMinFromArray(int[] arr) {
		int min = arr[0];
		int l = arr.length;
		for (int i = 1; i < l; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

//	6) Write a Java program to reverse an array of integer values
	public static int[] reverseArray(int[] arr) {
		int l = arr.length;
		int[] reversed = new int[l];

		for (int i = l - 1; i >= 0; i--) {
			reversed[l - 1 - i] = arr[i];
		}

		return reversed;
	}

//	7) Write a Java program to find the duplicate values of an array of integer values
	public static int[] findDuplicates(int[] arr) {
		int l = arr.length;
		int max = arr[0];

		for (int i = 1; i < l; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int size = 0;
		int l2 = max + 1;
		int[] duplicates = new int[l2];

		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if (arr[i] == arr[j] && (duplicates[arr[j]] < 1)) {
					duplicates[arr[i]]++;
					size++;
					break;
				}
			}
		}
		int[] result = new int[size];
		int index = 0;
		for (int i = 0; i < l2; i++) {
			if (duplicates[i] > 0) {
				result[index] = i;
				index++;
			}
		}

		return result;
	}

//	8) Write a Java program to find the duplicate values of an array of string values
	
	
}

public class Arrays1 {

	public static void main(String... args) {
		double[] arr = new double[] { 1, 2.2, 3, 4.5, 5 };
		int[] arr1 = { 1, 2, 3, 5, 4, 6 };

//  1) System.out.println(Answers.findAverage(arr));
//  2) System.out.println(Answers.contains(-1, arr1));
//	3) System.out.println(Answers.findIndexFromArray(6, arr1));

//  4)
//		int[] arrResult = Answers.removeElement(1, arr1);
//		for(int i = 0 ; i < arrResult.length; i++) {
//			System.out.println(arrResult[i]);
//		}

//	5) 
//		System.out.println(Answers.findMaxFromArray(arr1));
//		System.out.println(Answers.findMinFromArray(arr1));

//  6) 
//		int[] reversed = Answers.reverseArray(arr1);
//		for(int i = 0; i < reversed.length; i++) {
//			System.out.println(reversed[i]);
//		}
//  7)
//		int[] result = Answers.findDuplicates(arr1);
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}

	}


//	9) Write a Java program to find the common elements between two
//	arrays (string values)
//	10) Write a Java program to remove duplicate elements from an array 11) Write a Java program to find the second largest element in an
//	array.
//	12) Write a Java program to find the second smallest element in an
//	array.
//	13) Write a Java program t o separate even and odd numbers of a
//	given array of integers. Put all even numbers first, and then odd
//	numbers.
//	14) Write a Java program to find the k largest elements in a given
//	array. Elements in the array can be in any order
//	15) Write a Java program to find the k smallest elements in a given
//	array. Elements in the array can be in any order
//	16) 17) 18) 19) 20)
//	Swap two array with tempary variable.
//	Swap three numbers with tempary variable
//	Program to copy all the elements of one array into another array
//	Program to find the frequency of each element of an array Program to print the elements of an array in reverse order
//	21) Program to print the elements of an array present on even position
//	22) 23) 24) 25) 26) 27)
//	Program to print the elements of an array present on odd position Program to print the sum of all the elements of an array
//	Program to sort the elements of an array in ascending order Program to sort the elements of an array in descending order
//	Swap two array with temp variable Swap three array with temp variable
}
