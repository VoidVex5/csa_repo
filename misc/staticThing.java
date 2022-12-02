class statass {
	public static void welsh() {
		System.out.println("Welsh");
	}
	public void english() {
		System.out.println("English");
	}
}

public class staticThing {
	public static void main(String[] args) {
		statass trest = new statass();
		trest.english();
		trest.welsh();
		statass.welsh();
	}
}
