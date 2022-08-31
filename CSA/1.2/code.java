import java.util.*;
public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = 10;
        b = 5;
        int t = a;
        b = t;
        a = b;
        System.out.println("Value of a: " + a + "\nValue of b: " + b + "\n"); // sets a, b, and t equal to the original value of a.

        //Suppose that a and b are int values. Simplify the following expression: (!(a < b) && !(a > b))
        //answer: (a == b)

        //The exclusive or operator ^ for boolean operands is defined to be true if they are different, false if they are the same. Give a truth table for this function.
        System.out.println("1 = True and 0 = False");
        System.out.println("True ^ False = " + (1^0));
        System.out.println("True ^ True = " + (1^1));
        System.out.println("False ^ False = " + (0^0));
        System.out.println("False ^ True = " + (0^1));

        //Q: Why does 10/3 give 3 and not 3.33333333?
        //A: Because that's integer division, which returns an integer

        System.out.println(2 + "bc"); //prints: 2bc
        //it does this because it prints 2 as is and then the + adds the string literal onto the end
        System.out.println(2 + 3 + "bc"); //prints: 5bc
        //the + operator adds the int values together and prints that, then the second + adds the string literal onto the end
        System.out.println((2+3) + "bc"); //prints: 5bc
        //same principle as the last one except the addition happens in parantheses so it happens before the addition of the string onto the end
        System.out.println("bc" + (2+3)); //prints: bc5
        //first the 2 and 3 are added up to 5 and then that gets bolted onto the end of the string literal
        System.out.println("bc" + 2 + 3); //prints: bc23
        //first the 2 gets bolted onto the string literal, then the 3 gets bolted onto the new string literal "bc2"

        int grade = sc.nextInt();
        boolean isA = (90 <= grade && grade <= 100);
        System.out.println("Value: " + isA);

        double yr = (double) (3/5); //prints 0.0
        System.out.println(yr);

        System.out.println((Math.sqrt(2) * Math.sqrt(2) == 2));

        //int a = 27 * "three";
        //code.java:46: error: bad operand types for binary operator '*'
        //double x3;
        //System.out.println(x3);
        //code.java:49: error: variable x3 might not have been initialized
        smth();
        int r1, r2, r3, r4;
        r1 = sc.nextInt();
        r2 = sc.nextInt();
        r3 = sc.nextInt();
        r4 = sc.nextInt();
        smth2(r1, r2, r3, r4);

        int rer, ere;
        rer = sc.nextInt();
        ere = sc.nextInt();
        System.out.println(div(rer, ere));
        //Barring overflow, give a code fragment to compute the maximum of two integers a and b without using Math.max() or if.

        a = 10;
        b = 12;
        int max = (a + b + Math.abs(a - b)) / 2;
    }

    private static void smth() {
        int threeInt = 3;
        int fourInt  = 4;
        double threeDouble = 3.0;
        double fourDouble  = 4.0;
        System.out.println(threeInt / fourInt);
        System.out.println(threeInt / fourDouble);
        System.out.println(threeDouble / fourInt);
        System.out.println(threeDouble / fourDouble);
    }
    private static void smth2(int x, int y, int x2, int y2) {
        double rsq = Math.pow((x-x2), 2) + Math.pow((y-y2), 2);
        if (rsq < 0.0) {
            rsq *= -1.0;
        }
        double rsq2 = Math.sqrt(rsq);
        print("Euclid (absolute) length: " + rsq2);
    }
    private static void print (String text) {
        System.out.println(text);
    }
    private static boolean div(int x, int y) {
        if ((x % 7 == 0) & (y % 7 == 0)) {
            return true;
        }
        return false;
    }
}
