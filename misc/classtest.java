class cat {
	private int age;
	private double weight;
	private String name;
	private boolean asleep;

	public cat() {
		name = new String("unnamed");
		age = 6;
		weight = 4.5;
		
	}

	public cat(int a, double w, String n, boolean as) {
		age = a;
		weight = w;
		name = n;
		asleep = as;
	}

	public void meow(double db) {
		System.out.println("Meow!");
	}

	public boolean isAsleep() { return asleep; }
	
	public double weigh_cat() { return weight; }
}

public class classtest {
	public static void main(String[] args) {
		cat Cat = new cat(12, 3.7, "Boncuk", false);
		cat u_cat = new cat(); 
	}
}
