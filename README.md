# refractorPractice
Practising debugging and refactoring of Java code.

#### Notes:
I didn't strictly stick to the 15-line requirement. Most methods are under 15 lines, but I decided not to delete comments or needlessly compress anything for the readability's sake, since this isn't really a codegolf challenge.

However, all methods are specialized so that they are reusable and easily readable/editable.

#### Todo's

Figure out a way to properly use the Complex class when calculating the offset of a point in the Mandelbrot set. Complex currently offers among others, square() and absolute(), which should in theory be sufficient to find a more elegant solution to the problem.

Currently, a very clumsy approach of parting the complex number into two components is used:

>  double realPart = (a * a) - (b * b) + xCoordinate;

>  double imaginaryPart = 2 * a * b + yCoordinate;

followed by:

>  a = realPart;
>  b = imaginaryPart;

These values are then turned into a complex number of the form a + bi:

> myComplex.set(a, b); //set real/imaginary part of myComplex to a,b respectively.


xCoordinate and yCoordinate, respectively, refer to the value c in f(z) = z² + c; which stays constant and in case of a visual representation of the Mandelbrot set, is the corresponding x/y value of the pixel the two loops are iterating over.



