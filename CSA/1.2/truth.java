public class truth {
    public static void main(String[] args) {
        boolean tru[] = {false, false, false};
        if ((args[0].equals("true")) || (args[0].equals("True"))) {
            tru[0] = true;
        }
        else {
            tru[0] = false;
            //System.out.println(args[0]);
        }
        if ((args[1].equals("true")) || (args[1].equals("True"))) {
            tru[1] = true;
            //System.out.println(args[1]);
        }
        else {
            tru[1] = false;
            //System.out.println(args[0]);
        }
        if ((args[2].equals("true")) || (args[2].equals("True"))) {
            tru[2] = true;
            //System.out.println(args[2]);
        }
        else {
            tru[2] = false;
        }
        /*System.out.println(tru[0]);
        System.out.println(tru[1]);
        System.out.println(tru[2]);*/
        if (tru[0] & tru[1] & tru[2]) {
            System.out.println("True");
        }
        else { System.out.println("False"); }
    }
}
