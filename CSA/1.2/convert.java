public class convert {
    public static void main(String[] args) {
        float[] yiq = new float[3];
        float y,i,q;

        float r = (float)Integer.parseInt(args[0]) / 255;
        float g = (float)Integer.parseInt(args[1]) / 255;
        float b = (float)Integer.parseInt(args[2]) / 255;

        /*y = (float)(0.299 * r + 0.587 * g + 0.114 * b);
        i = (float)(0.596 * r - 0.275 * g - 0.322 * b);
        q = (float)(0.212 * r - 0.523 * g + 0.311 * b);*/

        yiq[0] = (float)(0.299 * r + 0.587 * g + 0.114 * b);
        yiq[1] = (float)(0.596 * r - 0.275 * g - 0.322 * b);
        yiq[2] = (float)(0.212 * r - 0.523 * g + 0.311 * b);

        System.out.print("YIQ: " + yiq[0] + ", " + yiq[1] + ", " + yiq[2]);
    }
}
