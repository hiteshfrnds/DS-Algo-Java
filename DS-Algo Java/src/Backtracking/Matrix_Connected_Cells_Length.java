package Backtracking;

public class Matrix_Connected_Cells_Length {
	public static void main(String[] args) {
		int arr[][] = {
				{1, 0, 1, 0, 0},
				{0, 1, 0, 1, 0},
				{0, 0, 1, 0, 1},
				{1, 0, 0, 1, 1},
				{0, 1, 0, 0, 0}
		};
		
		// Print Input
		int m = arr.length;
		int n = arr[0].length;
		for (int i=0; i<m; i++) {
			System.out.println();
			for (int j=0; j<n; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		System.out.println();
		
		System.out.println("\nLength is " + connectedCellsLength(arr));
	}
	
	static int connectedCellsLength(int [][]arr) {
		int max = -1;
		int m = arr.length;
		int n = arr[0].length;
		
		boolean visited[][] = new boolean[m][n];
		
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				if (arr[i][j] == 0 || visited[i][j]) {
					continue;
				}
				int count = 0;
				// System.out.println("calling recursion");
				count = findRecursion(arr, visited, i, j, count);
				// System.out.println(count);
				if (max < count)
					max = count;
			}
		}
		return max;
	}
	
	static int findRecursion(int arr[][], boolean visited[][], int i, int j, int count) {
		int m = arr.length;
		int n = arr[0].length;
		if (i<0 || i>=m || j<0 || j>=n)
			return count;
		
		if (arr[i][j] == 0 || visited[i][j])
			return count;
		
		visited[i][j] = true;
		
		count++;
		//System.out.println(i+ " " + j);
		count = findRecursion(arr, visited, i-1, j-1, count);
		count = findRecursion(arr, visited, i-1, j, count);
		count = findRecursion(arr, visited, i-1, j+1, count);
		count = findRecursion(arr, visited, i, j-1, count);
		count = findRecursion(arr, visited, i, j+1, count);
		count = findRecursion(arr, visited, i+1, j-1, count);
		count = findRecursion(arr, visited, i+1, j, count);
		count = findRecursion(arr, visited, i+1, j+1, count);
		
		return count;
	}
}
