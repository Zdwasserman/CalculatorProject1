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
        if(second == 0)
        {
            System.out.println("ERROR. You can't divide by 0, and you should know this.");
            return first;
        }
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

    public int toggleDisplayUnits(double a , int counter)
    {
        counter++;
        switch (counter)
        {
            case 1: bin(a); break;
            case 2: oct(a); break;
            case 3: hex(a); break;
            case 4: dec(a); break;
            case 5: counter = 0; break;
        }
        return counter;
    }

    public void bin(double a)
    {
        System.out.println("The current answer value in BINARY form is: " + Integer.toBinaryString((int)Math.round(a)));
    }

    public void oct(double a)
    {
        System.out.println("The current answer value in OCTAL form is: " + Integer.toOctalString((int)Math.round(a)));
    }

    public void hex(double a)
    {
        System.out.println("The current answer value in HEXIDECIMAL form is: " + Integer.toHexString((int)Math.round(a)));
    }

    public void dec(double a)
    {
        System.out.println("The current answer value in DECIMAL for is: " + a);
    }

    public double cbrt(double a)
    {
        return Math.cbrt(a);
    }

    public double avg(double a , double b)
    {
        return ((a+b)/2);
    }


}
