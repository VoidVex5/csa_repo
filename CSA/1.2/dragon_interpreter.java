public class dragon_interpreter {
    public static void main(String[] args) {
        String dragon0 = "F";
        // one forward
        String nogard0 = "F";
        // one forward
        String dragon1 = dragon0 + "L" + nogard0;
        // one forwards, left, one forwards
        String nogard1 = dragon0 + "R" + nogard0;
        // one forward, right, one forward
        String dragon2 = dragon1 + "L" + nogard1;
        // one forwards, left, one forwards, left, one forward, right, one forward
        String nogard2 = dragon1 + "R" + nogard1;
        // one forwards, left, one forwards, right, one forward, right, one forward
        String dragon3 = dragon2 + "L" + nogard2;
        // one forwards, left, one forwards, left, one forward, right, one forward, left, 
        // one forwards, left, one forwards, right, one forward, right, one forward
        String nogard3 = dragon2 + "R" + nogard2;
        // one forwards, left, one forwards, left, one forward, right, one forward, right,
        // one forwards, left, one forwards, right, one forward, right, one forward
        String dragon4 = dragon3 + "L" + nogard3;
        // one forwards, left, one forwards, left, one forward, right, one forward, left, 
        // one forwards, left, one forwards, right, one forward, right, one forward, left,
        // one forwards, left, one forwards, left, one forward, right, one forward, right,
        // one forwards, left, one forwards, right, one forward, right, one forward
        String nogard4 = dragon3 + "R" + nogard3;
        // one forwards, left, one forwards, left, one forward, right, one forward, left, 
        // one forwards, left, one forwards, right, one forward, right, one forward, right,
        // one forwards, left, one forwards, left, one forward, right, one forward, right,
        // one forwards, left, one forwards, right, one forward, right, one forward
        String dragon5 = dragon4 + "L" + nogard4;
        // one forwards, left, one forwards, left, one forward, right, one forward, left, 
        // one forwards, left, one forwards, right, one forward, right, one forward, left,
        // one forwards, left, one forwards, left, one forward, right, one forward, right,
        // one forwards, left, one forwards, right, one forward, right, one forward, left
        // one forwards, left, one forwards, left, one forward, right, one forward, left, 
        // one forwards, left, one forwards, right, one forward, right, one forward, right,
        // one forwards, left, one forwards, left, one forward, right, one forward, right,
        // one forwards, left, one forwards, right, one forward, right, one forward

        System.out.println(dragon0);
        System.out.println(dragon1);
        System.out.println(dragon2);
        System.out.println(dragon3);
        System.out.println(dragon4);
        System.out.println(dragon5);
    }

}
