public class WindChill {
    public static void main(String[] args) {
        System.out.println("Temperature = " + Double.parseDouble(args[0]));
        System.out.println("Wind speed  = " + Double.parseDouble(args[1]));
        System.out.println("Wind chill  = " + (35.74 + 0.6215*Double.parseDouble(args[0]) + (0.4275*Double.parseDouble(args[0]) - 35.75) * Math.pow(Double.parseDouble(args[1]), 0.16)));
    }

}
