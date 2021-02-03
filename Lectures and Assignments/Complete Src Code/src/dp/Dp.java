package dp;

public class Dp {

	static int fibRec(int num) {
		if (num == 0 || num == 1) {
			return num;
		}
		return fibRec(num - 1) + fibRec(num - 2);
	}

	static long fib_better(int num) {
		long[] storage = new long[num + 1];
		return fibRec_Memoize(num, storage);
	}

	static long fibRec_Memoize(int num, long[] storage) {
		if (num == 0 || num == 1) {
			storage[num] = num;
			return storage[num];
		}

		if (storage[num] > 0) {
			return storage[num];
		}
		storage[num] = fibRec_Memoize(num - 1, storage)
				+ fibRec_Memoize(num - 2, storage);
		return storage[num];
	}

	static int fibonacci_tabulization(int num) {
		int[] table = new int[num + 1];
		table[0] = 0;
		table[1] = 1;
		for (int i = 2; i <= num; i++) {
			table[i] = table[i - 1] + table[i - 2];
		}
		return table[num];
	}

	public static int LCS(String s, String t, int[][] storage) {
		if (s.length() == 0 || t.length() == 0) {
			return 0;
		}
		if(storage[][])
		if (s.charAt(0) == t.charAt(0)) {
			return 1 + LCS(s.substring(1), t.substring(1));
		} else {
			return Math.max(LCS(s.substring(1), t), LCS(s, t.substring(1)));
		}
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		int ans = fibonacci_tabulization(30);
		System.out.println(ans);
	}

}
