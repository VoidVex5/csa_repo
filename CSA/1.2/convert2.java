public class convert2 {
    public static void main(String[] args){
        float[] cmyk = new float[4];

        float r = Integer.parseInt(args[0]) / 255f;
        float g = Integer.parseInt(args[1]) / 255f;
        float b = Integer.parseInt(args[2]) / 255f;

        float k = 1.0f - Math.max(r, Math.max(g, b));
        float c = (1f-r-k) / (1f-k);
        float m = (1f-g-k) / (1f-k);
        float y = (1f-b-k) / (1f-k);

        cmyk[0] = c;
        cmyk[1] = m;
        cmyk[2] = y;
        cmyk[3] = k;

    }
}
