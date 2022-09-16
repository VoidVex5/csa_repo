public class summy { 
	public static void main(String[] args) {
		int sum = 0;
		// value lmao
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		// gets the sum of all values till 100
		int sum2 = (sum*sum);
		// sum2 is equal to the square of the sum
		sum = 0; // recycle, reuse
		for (int i = 1; i <= 100; i++) {
                        sum += i * i;
                }
		// get the sum of the squares of all values up to a 100 
		System.out.println("Value: " + (sum2 - sum));
	}
}
