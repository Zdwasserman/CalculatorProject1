package mccann.kurt.calculator;

/**
 * Created by kurtmccann on 9/12/16.
 */
public class CoreMath
{
    public static double add(double first, double second)
    {
        return first+second;
    }

    public static double subtract(double first, double second)
    {
        return first-second;
    }

    public static double multiply(double first, double second)
    {
        return first * second;
    }

    public static double divide(double first, double second)
    {
        return first / second;
    }

    public static double square(double first)
    {
        return Math.pow(first, 2);
    }

    public static double squareroot(double a)
    {
        return Math.sqrt(a);
    }

    public static double exponent(double a, double b)
    {
        return Math.pow(a,b);
    }

    public static double inverse(double a)
    {
        return 1/a;
    }

    public static double invert(double a)
    {
        return a*(-1);
    }

    public static double log(double a)
    {
        return Math.log10(a);
    }

    public static double tenExp(double a)
    {
        return Math.pow(10, a);
    }

    public static double ln(double a)
    {
        return Math.log(a);
    }

    public static double eToTheX(double a)
    {
        return Math.exp(a);
    }

    public static double factorial (double a)
    {
        double toReturn = 1;
        for (double i = 1; i < a ; i++)
        {
            toReturn = toReturn * i;
        }
        return toReturn;
    }

    public double bin(double a)
    {
        return Double.parseDouble(Long.toBinaryString(Double.doubleToRawLongBits(a)));
    }


}
