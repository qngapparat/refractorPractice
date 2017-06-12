import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Created by qngapparat on 12.06.17.
 */
public class Complex{


    private double real, imaginary;

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(){
        this(0.0, 0.0);
    }

    public double getReal(){
        return this.real;
    }

    public double getImaginary(){
        return this.imaginary;
    }

    public void set(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public void addToReal(double number){
        this.real += number;
    }

    public void addToImaginary(double number){
        this.imaginary += number;
    }

    public double absolute(){

        //absolute value of a + bi == sqrt((a^2 + b^2)):
        return sqrt(( pow(this.getReal(), 2) + pow(this.getImaginary(), 2) ));

    }

    public static Complex square (Complex complexNumber){

        //(a + bi)^2 == a^2 + 2ab - b^2

        //first part: a^2
        double realPart = pow(complexNumber.getReal(), 2);
        //second part: 2ab - b^2
        double imaginaryPart = 2 * complexNumber.getReal() * complexNumber.getImaginary() - pow(complexNumber.getImaginary(), 2);

        //a^2 + 2ab - b^2
        return new Complex(realPart, imaginaryPart);
    }


}
