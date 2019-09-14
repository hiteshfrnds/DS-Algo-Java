package Backtracking;

public class Tower_of_hanoi {

	public static void main(String[] args) {
		TowerOfHanoi(3, 'A', 'B', 'C');
	}
	
	static void TowerOfHanoi(int n, char from, char to, char aux) {
		if (n == 1) { // only 1 disk
			System.out.format("Move %d disk from %c to %c\n", n, from, to);
			return;
		}
		
		// Move n-1 disk; from -> aux
		TowerOfHanoi(n-1, from, aux, to);
		
		// Move remaining disk; from -> to
		System.out.format("Move %d disk from %c to %c\n", n, from, to);
		
		// Move n-1 disk; aux -> to 
		TowerOfHanoi(n-1, aux, to, from);
	}

}
