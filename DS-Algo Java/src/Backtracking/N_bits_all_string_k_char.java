package Backtracking;

public class N_bits_all_string_k_char {

	public static void main(String[] args) {
		N_bits_all_string_k_char obj = new N_bits_all_string_k_char();
		
		int n = 2;
		int k = 3;
		System.out.println("\n Generate for " + n);
		obj.generateNBits(n, k);
		
		n = 4;
		k = 2;
		System.out.println("\n Generate for " + n);
		obj.generateNBits(n, k);
	}
	
	void generateNBits(int n, int k) {
		char A[] = new char[n];
		generate(A, n-1, k);
	}
	
	void generate(char []A, int n, int k) {
		if (n < 0) {
			System.out.println(A);
			return;
		}
		for(int i=0; i<k; i++) {
			A[n] = (char)('0' + i);
			generate(A, n-1, k);
		}
	}

}
