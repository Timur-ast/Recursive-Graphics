public class Transform2D {

    public static void scale(double[] x, double[] y, double alpha) {
        for (int i = 0; i < x.length; i++) {
            x[i] = alpha * x[i];
            y[i] = alpha * y[i];
        }
    }

    public static void translate(double[] x, double[] y, double dx, double dy) {
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] + dx;
            y[i] = y[i] + dy;
        }
    }

    public static double[] copy(double[] array) {
        double[] a = new double[array.length];
        for (int i = 0; i < array.length; i++)
            a[i] = array[i];
        return a;
    }

    public static void rotate(double[] x, double[] y, double theta) {
        double[] cx = copy(x);
        double[] cy = copy(y);
        for (int i = 0; i < x.length; i++) {
            x[i] = cx[i] * Math.cos(Math.toRadians(theta)) - cy[i] * Math
                    .sin(Math.toRadians(theta));
            y[i] = cy[i] * Math.cos(Math.toRadians(theta)) + cx[i] * Math
                    .sin(Math.toRadians(theta));
        }
    }

    public static void main(String[] args) {
        StdDraw.setScale(-5.0, +5.0);
        double[] x = { 0, 1, 1, 0 };
        double[] y = { 0, 0, 2, 1 };

        double[] cx = copy(x);
        double[] cy = copy(y);

        rotate(cx, cy, -45.0);
        translate(cx, cy, 1.0, 2.0);
        scale(cx, cy, 1.5);

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(cx, cy);

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);
    }
}
