public class Art {

    // Программа: Множкство Кантора(Cantor set)
    
    public static void drawQuadrate(double x, double y, double radius) {
        double[] a = { x - radius, x + radius, x + radius, x - radius };
        double[] b = { y - radius, y - radius, y + radius, y + radius };
        StdDraw.polygon(a, b);
    }

    public static void сantor(int n, double x, double y, double radius) {
        if (n == 0) return;
        drawQuadrate(x, y, radius);

        сantor(n - 1, x - radius, y - radius, radius / 2);
        сantor(n - 1, x + radius, y + radius, radius / 2);
        сantor(n - 1, x - radius, y + radius, radius / 2);
        сantor(n - 1, x + radius, y - radius, radius / 2);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double x = 0.5;
        double y = 0.5;
        double radius = 0.2;

        сantor(n, x, y, radius);
    }
}
