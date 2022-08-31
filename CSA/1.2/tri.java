public class tri {
    public static void main(String[] args) {
        int x, y, z;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        z = Integer.parseInt(args[2]);

        double s = (x + y + z) / 2.0;
        double r = Math.sqrt(s*(s-x)*(s-y)*(s-z));

        System.out.println(r);
    }

}
