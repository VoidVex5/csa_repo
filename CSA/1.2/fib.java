public class fib {
    public static void main(String[] args) {
        System.out.println(fib(Integer.parseInt(args[0])));
    }
    private static String fib(int x) {
        String str = new String("");
        String str1 = new String("");
        String str2 = new String("");
        for(int i = 0; i < x; i++) {
            if (i == 0) {
                str = "a";
            }
            else if (i == 1) {
                str1 = str;
                str = "b";
            }
            else {
                str2 = str1;
                str1 = str;
                str = str1 + str2;
            }
        }
        return str;
    }
}
