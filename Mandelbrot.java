public class Mandelbrot {

    public static void main(String[] args) {
        double deltaY = 0.05;
        for (double yCoordinate = -1.2; yCoordinate < 1.2; yCoordinate += deltaY) {
            double deltaX = 0.025;
            for (double xCoordinate = -2.2; xCoordinate < 1.0; xCoordinate += deltaX) {
                double a = 0.0;
                double b = 0.0;
                int maxIterations = 100;
                double infinityThreshold = 2;
                double offset = 0.0;
                for (int j = 0; j < maxIterations; j++) {
                    double realPart = (a * a) - (b * b) + xCoordinate;
                    double imaginaryPart = 2 * a * b + yCoordinate;

                    a = realPart;
                    b = imaginaryPart;
                    offset = Math.sqrt(a * a + b * b);
                    if (offset > infinityThreshold) {
                        break;
                    }
                }
                if (offset > infinityThreshold) {
                    System.out.print(" ");
                } else {
                    System.out.print("\u25a0");
                }
            }
            System.out.print("\n");
        }
    }
}