class reference_type {
	private int lmao;
	public void print() { System.out.println(lmao); }
	public reference_type(int x) {
		lmao = x;
	}
}
public class notc {
	public static void main(String[] args) {
        reference_type x;
        String y;
        int z;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        // all give the same error: variable _name_ might not have been initialized
	// initialise the values
	// initialise the class using the constructor
	// initialise the string using new and ur preferred initalisation
	// initalise the int by giving it an appropriate integer value
    }

}
