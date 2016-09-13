package mccann.kurt.calculator;
/**
 * Created by kurtmccann on 9/11/16.
 */
public class TrigFunctions
{
    double value;
    String unitsMode = "degrees";

    public double sin(double input, boolean radians) //accepts angles in radians
    {
        if(!radians)
        {
            input = toggleRadsDeg(input, radians);
        }
        return Math.sin(input);
    }

    public double cos(double input, boolean radians)  //accepts angles in radians
    {
        if(!radians)
        {
            input = toggleRadsDeg(input, radians);
        }
        return Math.cos(input);
    }
    public double tan(double input, boolean radians)  //accepts angles in radians
    {
        if(!radians)
        {
            //double intoMethod = input ;
            input =toggleRadsDeg(input, radians);  //use intoMethod if it's not working
        }
        return Math.tan(input);
    }

    public double insin(double input) //return angle in rads
    {
        return 1/Math.sin(input);                               //????
    }

    public double incos(double input)  //return angle in rads
    {
        return 1/Math.cos(input);                                 ////????
    }

    public double intan(double input)  //return angle in rads
    {
        return 1/Math.atan(input);
    }

    public static double toggleRadsDeg(double num, boolean rads)
    {
        if(rads)
        {
            System.out.println("Units are now in Degrees");
            return num*(180/(Math.PI));
        }
        else
        {
            System.out.println("Units are now in Radians");
            return num*((Math.PI)/180);
        }
    }

//    public void switchUnitsMode()
//    {
//        if(this.unitsMode.equals("degrees"))
//        {
//            this.unitsMode = "radians";
//        }
//
//    }








}
