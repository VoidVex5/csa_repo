public class code {
    public static void main(String[] args) {
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
        
    }
}
