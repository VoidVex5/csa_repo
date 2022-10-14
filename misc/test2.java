public class test2 {
	public static void main(String[] args) {
		for (int j = 0; j < 2; ++j) {
			for (int i = 1; i <= 20; ++i) {
				if (i % 2 == 0 && j == 0) {
					System.out.println("Even: " + i);
				}
				else if (i % 2 != 0 && j == 1) {
					System.out.println("Odd: " + i);
				}
			}
		}
		for (int j = 0; j < 2; j++) {
            for (int i = 1; i <= 20; i++) {
				if (i % 2 == 0 && j == 0) {
                    System.out.println("Even: " + i);
                }
                else if (i % 2 != 0 && j == 1) {
                    System.out.println("Odd: " + i);
                }
           	}
		}
	}
}
