public class solution {

	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
		if (m == 0 || n == 0) {
			return 0;
		}
		if (m == 1) {
			return n;
		}
		else {
			return n + multiplyTwoIntegers(m-1,n);
		}
	
	}
}
