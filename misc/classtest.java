class cat {
	private int age;
	private double weight;
	private String name;
	private boolean asleep;
	// attributes

	public cat() {
		name = new String("unnamed");
		age = 6;
		weight = 4.5;
		
	} // default constructor

	public cat(int a, double w, String n, boolean as) {
		age = a;
		weight = w;
		name = n;
		asleep = as;
	} // regular constructor

	public void meow(double db) {
		System.out.println("Meow!");
	} // meow method

	public boolean isAsleep() { return asleep; } // checks if the cat is asleep
	
	public double weigh_cat() { return weight; } // weighs the cat and gets its weight
}

public class classtest { // main classs
	public static void main(String[] args) {
		cat Cat = new cat(12, 3.7, "Boncuk", false); // a constructed cat instance
		cat u_cat = new cat(); // a default cat instance
	}
}
