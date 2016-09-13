package mccann.kurt.calculator;

import java.util.Scanner;
/**
 * Created by kurtmccann on 9/12/16.
 */
public class Input
{
    //READ USER INPUT
    Scanner in = new Scanner(System.in);
    public double readNumber()
    {
        System.out.println("Enter a number");
        return in.nextDouble();
    }
    public String readString()
    {
        System.out.println("Enter an operator");
        return in.next();
    }


}
