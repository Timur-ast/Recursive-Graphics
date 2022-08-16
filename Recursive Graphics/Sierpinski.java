public class Sierpinski {
    public static double height(double length) {
        return length * (Math.sqrt(3) / 2);
    }

    public static void filledTriangle(double x, double y, double length) {
        double[] a = { x, x - length / 2, x + length / 2 };
        double[] b = { y, y + height(length), y + height(length) };
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledPolygon(a, b);
    }

    public static void sierpinski(int n, double x, double y, double length) {
        if (n == 0) return;
        filledTriangle(x, y, length);

        sierpinski(n - 1, x, y + height(length), length / 2);
        sierpinski(n - 1, x + length / 2, y, length / 2);
        sierpinski(n - 1, x - length / 2, y, length / 2);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double x = 0.5;
        double y = 0.0;
        double s = 0.5;
        double[] a = { 0.0, 1.0, 0.5 };
        double[] b = { 0.0, 0.0, Math.sqrt(3.0) / 2.0 };
        StdDraw.polygon(a, b);
        sierpinski(n, x, y, s);
    }
}
