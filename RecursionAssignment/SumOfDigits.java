
public class solution {

	public static int sumOfDigits(int input){
		// Write your code here
	
		if (input/10 > 0) {
      //recursive case
			return input%10 + sumOfDigits(input/10);
		}
		else {
      //base case
			return input;
		}

	}
}
