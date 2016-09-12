import java.util.Scanner;

/**
 * Created by kurtmccann on 9/11/16.
 */
public class Calculator
{
    ; //This defines the type of input that is being accepted at this time: firstNum, Operator, or secondNum;

    double firstNum;                    //The first number put in by the user in a multiple input expression. Ex: The "1" in "1+5"
    String operator;                    //The operator.  Ex: the "+"
    double secondNum;                       //The secondNum. Ex: the "5"
    public boolean enterHit = true;      //True if the user has just hit enter, false otherwise;

    //Getters
    public double getFirstNum()
    {
        return firstNum;
    }
    public String getOperator()
    {
        return operator;
    }
    public double getSecondNum()
    {
        return secondNum;
    }

    //Setters
    public void setFirstNum(double num)
    {
        this.firstNum = num;
    }
    public void setSecondNum(double num)
    {
        this.secondNum = num;
    }
    public void setOperator(String op)
    {
        this.operator = op;
    }

    public double executeOperation()
    {
        double toReturn;
       switch (this.operator)
       {
           case "+" : toReturn = CoreMath.add(firstNum, secondNum); break;
           case "-" : toReturn = CoreMath.subtract(firstNum, secondNum); break;
           case "*" : toReturn = CoreMath.multiply(firstNum, secondNum); break;
           case "/" : toReturn = CoreMath.divide(firstNum, secondNum); break;
           case "sq" : toReturn = CoreMath.square(firstNum); break;
           case "^2" : toReturn = CoreMath.squareroot(firstNum); break;
           case "^" : toReturn = CoreMath.square(firstNum); break;
           case "exp" : toReturn = CoreMath.exponent(firstNum, secondNum); break;
           case "^-1" : toReturn = CoreMath.inverse(firstNum); break;
           case "(-1)" : toReturn = CoreMath.invert(firstNum); break;
           default: System.out.println("Invalid operator.  Try again.");
                    toReturn = 0; break;
       }
       return toReturn;
    }

}

