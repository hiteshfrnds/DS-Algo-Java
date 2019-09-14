package Backtracking;

/*
 * Generate all the strings of n bits. Assume A[0..n – 1] is an array of size n.
 */

public class N_bits_all_string {

	public static void main(String[] args) {
		N_bits_all_string obj = new N_bits_all_string();
		
		int n = 2;
		System.out.println("\n Generate for " + n);
		obj.generateNBits(n);
		
		n = 4;
		System.out.println("\n Generate for " + n);
		obj.generateNBits(n);
	}
	
	void generateNBits(int n) {
		char A[] = new char[n];
		generate(A, n-1);
	}
	
	void generate(char []A, int n) {
		if (n < 0) {
			System.out.println(A);
			return;
		}
		A[n] = '0';
		generate(A, n-1);
		A[n] = '1';
		generate(A, n-1);
	}

}
