package arrays;

public class JaggedArray {
	
	public static void main(String ... args) {
	//1
	int[][]jaggedArray = new int[][] {{1,2,3},{1,2}};
	
	int [] arr1 = new int[] {1,2,3,4};
	int [] arr2 = new int[] {1,2};
	int [] arr3 = new int[] {1,2,3,4,5};
	
	//2
	int[][]jaggedArray1 = new int[][]{ arr1, arr2, arr3};
	
	//print
	for(int i = 0; i < jaggedArray1.length; i++) {
		for(int j = 0; j < jaggedArray1[i].length; j++) {
			System.out.println(jaggedArray1[i][j]);
		}
		System.out.println();
	}
	}

}
