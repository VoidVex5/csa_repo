public class CartesianToPolar {
    public static void main(String[] args) {
        System.out.println("r = " + (Math.sqrt(Double.parseDouble(args[0])*Double.parseDouble(args[0]) +  Double.parseDouble(args[1])*Double.parseDouble(args[1]))));
        System.out.println("theta = " + Math.atan2(Double.parseDouble(args[1]), Double.parseDouble(args[0])));
    }
}
