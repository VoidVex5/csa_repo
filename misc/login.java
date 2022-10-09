import java.io.*;
import java.util.*;

public class login {
	public static void main(String[] args) {
	}

// algorithm class does the whole thing
class algorithm {
	private String name;
	private String birth;
	private String last_name;
	private String middle_name;
	public String finished_product;
	
	private File log;
	private Scanner sc; //= new Scanner(System.in);
	private int dbid;
	private fw;
	private Scanner fr; // on god
	private String dbp;

	public algorithm(int DBID, String database_path) {
		dbid = DBID;
		dbp = database_path;
	}

	public void login() {
		try {
			log = new File(database_path + "log_" + String.vlaueOf(DBID) + ".txt")
	}

	void set_name() {
		System.out.print("Enter a string: ");  
		String str= sc.nextLine(); 
	}


	
}
