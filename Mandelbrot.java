public class Mandelbrot {

    public static void main(String[] args) {
        for (double yCoordinate = -1.2; yCoordinate < 1.2; yCoordinate += 0.05) {
            for (double xCoordinate = -2.2; xCoordinate < 1.0; xCoordinate += 0.025) {
                double a = 0.0;
                double b = 0.0;
                int j;
                int maxIterations = 100;
                double infinityTreshold = 2;
                double g = 0.0;
                for (j = 0; j < maxIterations; j++) {
                    double zr = a * a;
                    double zi = 2 * a * b; //using infinityTreshold as 2 doesn't make sense here
                    zr -= b * b;
                    zr += xCoordinate;
                    zi += yCoordinate;
                    a = zr;
                    b = zi;
                    g = Math.sqrt(a * a + b * b);
                    if (g > infinityTreshold) {
                        break;
                    }
                }
                if (g > infinityTreshold) {
                    System.out.print(" ");
                } else {
                    System.out.print("\u25a0");
                }
            }
            System.out.print("\n");
        }
    }
}