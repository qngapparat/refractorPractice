public class Mandelbrot {

    //as a threshold for values of the Mandelbrot-function over which a pixel is not drawn
    private static double infinityThreshold = 2;
    private static double deltaY = 0.05;
    private static double deltaX = 0.025;
    private static int maxIterations = 100;

    private static double minX = -2.2;
    private static double minY = -1.2;

    private static void paintPixel(double offset){
        if (offset > Mandelbrot.infinityThreshold) {
            System.out.print(" ");
        } else {
            System.out.print("\u25a0");
        }
    }


    public static void main(String[] args) {
        for (double yCoordinate = Mandelbrot.minY; yCoordinate < 1.2; yCoordinate += deltaY) {
            for (double xCoordinate = Mandelbrot.minX; xCoordinate < 1.0; xCoordinate += deltaX) {
                double a = 0.0;
                double b = 0.0;
                Complex myComplex = new Complex(0.0, 0.0);
                for (int j = 0; j < maxIterations; j++) {
                    double realPart = (a * a) - (b * b) + xCoordinate;
                    double imaginaryPart = 2 * a * b + yCoordinate;
                    a = realPart;
                    b = imaginaryPart;
                    //set the Complex numbers real and imaginary part to a and b
                    myComplex.set(a, b);
                    if (myComplex.absolute() > Mandelbrot.infinityThreshold) {
                        break;
                    }
                }
                Mandelbrot.paintPixel(myComplex.absolute());
            }
            System.out.print("\n");
        }
    }
}