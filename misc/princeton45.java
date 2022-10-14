public class princeton45 {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        String result = new String("");

        int sum = 0;
        for (int i = 2; i <= 10; i++) {
            int dig = num % 10;
            if (i == 2 || i == 7 || i == 10) result = "-" + result;
            result = dig + result;
            sum += i * dig;
            num /= 10;
        }

        // print out check digit, use X for 10
        if (sum % 11 == 1) {
			result += "X";
		}
        else if (sum % 11 == 0) {
			result += "0";
		}
		else {
			result += (11 - sum % 11);
		}
        System.out.println(result);
    }
}

