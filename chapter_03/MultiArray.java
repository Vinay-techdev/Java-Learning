package chapter_03;

public class MultiArray {

	public static void main(String[] args) {
		
		// way 1 to create array
		// int[][] arr;
		// arr = new int[2][3];
		
		// way 2 to create array
		//int[][] arr = new int[2][3];
		
		// way 3 to create array
		 int[][] arr = {{1,2,3,4},{5,6,7,8}};
		 System.out.println("Normal traversing");
		 System.out.println(arr[0][0]);
		 System.out.println(arr[0][1]);
		 System.out.println(arr[0][2]);
		 System.out.println(arr[0][3]);
		 
		 System.out.println(arr[1][0]);
		 System.out.println(arr[1][1]);
		 System.out.println(arr[1][2]);
		 System.out.println(arr[1][3]);
		 
		 System.out.println("Traversing using for loop");
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++){
					System.out.print(arr[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}
			
		System.out.println("Traversing using for each loop");
		for(int[] i : arr) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
