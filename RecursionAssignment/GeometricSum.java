import java.lang.Math;
public class solution {

	public static double findGeometricSum(int k){
		// Write your code here
		// double ans = 1;
		// for (int i = 1; i <= k; i++) {
		// 	double temp = Math.pow(2,i);
		// 	ans += 1/temp;
		// }
		// return ans;
		if ( k == 0) {
			return 1;
		}

		double smallans=findGeometricSum(k-1);
        	return smallans+(1/Math.pow(2,k));
	}
}
