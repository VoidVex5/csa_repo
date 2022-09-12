public class number32 {
    public static void printi(int i) {
        System.out.println("Value: " + i);
    }
    public static void printf(double d) {
        System.out.println("Value: " + d);
    }
    public static void main(String[] args) {
        //in other languages, there are usually unsigned versions of these numbers, which denote if they have a bit reserved for
        // indicating negativity or positivity
        // unsigned numeric values cannot be negative

        byte w = 'a';
        // can store up to 8 bits of data (up to 255)
        // signed bytes can store between [-128, 127]
        // used for ASCII characters
        // same thing as char in the binary

        short x = 2343;
        // can store up to 16 bit data (65,535)
        // signed shorts can store between [-32768, 32767]
        // used for smaller number

        int y = 6238232;
        // can store up to 32 bits of data (4,294,967,295)
        // signed ints can store between [-2147483648, 2147483647]
        // can be used to store UTF-8 encoded characters
        // given maximum unsigned value because it gives an error upon giving the theoretical maximum

        long z = 127352346;
        // can store up to 64 bits of data (18,446,744,073,709,551,615)
        // signed longs can store values between [-9223372036854775808, 9223372036854775807]
        //used for really big numbers (mathematical computations, bank information, etc.)
        // given maximum unsigned value because it gives an error upon giving the theoretical maximum
        // commented out because it won't work for some reason


        float a = 12.3f;
        // floats are 32 bit numeric types capable of storing decimal numbers (floating point numbers)
        // they are standardized using the IEEE 754 standard
        // they're too complex to write in comment form
        // f is used to denote a float literal

        double b = 4.8223;
        // doubles are 64 bit numeric types capable of storing decimal numbers (floating point numbers)
        // they are standardized using the IEEE 754 standard
        // they're also too complex to write in comment form
        // all floating point literals are assumed to be doubles by default so no need to denote it

        // java has 5 arithmetic operations to perform mathematical operations with
        int add = 5 + 2;
        printi(add);
        // + returns the addition of the first value to the second one
        // 5+2 = 7 so add = 7
        int sub = 5 - 2;
        printi(sub);
        // - returns the subtraction of the first value from the second one
        // 5-2 = 3 so sub = 3
        int mul = 5*2;
        printi(mul);
        // * returns the multiplication of the two values
        // 5*2 = 10 so mul = 10
        // because the values multiplied are integers, they return an integer value
        double mul_f = 2.5 * 2.5;
        printf(mul_f);
        // if we multiplied two floating point numbers, we'd get a floating point number returned
        // unless the variable isn't of type float or double, which then it'll give an error
        int div = 5/2;
        printi(div);
        // * returns the result division of the first value by the second value
        // depending on the type of the value, it may return a floating point value
        // or an integer value
        // in this example, because the variable it is being assigned to is of type int
        // it returns 2
        float div_f = 5/2;
        printf(div_f);
        //while div_f would be assigned the value of 2.5
        int mod = 12 % 5;
        printi(mod);
        // the modulo operator returns the remaining value after a standard division happens
        // 12/5 = 5*2 + 2
        // that 2 is what gets returned
        if ( 4 % 2 == 0) {
            System.out.println("Is divisible by 2");
        }
        // most commonly used to check for proper divisibility
        printi(12 % 10);
        // and getting the last digit of an integer by modulo-ing by 10

    }
}
