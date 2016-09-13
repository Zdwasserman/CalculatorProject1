package mccann.kurt.calculator;

/**
 * Created by kurtmccann on 9/11/16.
 */
public class Calculator
{
    Boolean firstCycle = true; //This is only true if calc has just been turned on, or has just been cleared.  Will cause calculator to request 1st argument rather that setting to display value.
    Double answer;
    Double memory;
    boolean radians = false;
    Input userInput = new Input();
    CoreMath math = new CoreMath();
    TrigFunctions tMath = new TrigFunctions();
//    ; //This defines the type of input that is being accepted at this time: firstNum, Operator, or secondNum;
//
    double firstNum;                    //The first number put in by the user in a multiple input expression. Ex: The "1" in "1+5"
    String operator;                    //The operator.  Ex: the "+"

//    public void switchUnitsMode(){
//
//    }
//    public void switchUnitsMode(String mode){
//
//    }

    public void executeCommand()
    {
        if(firstCycle)
        {
            firstNum = userInput.readNumber();
            firstCycle = false;
        }
        else
        {
            firstNum = answer;
        }

        operator = userInput.readString();

        switch (operator)
       {
           case "+" : answer = math.add(firstNum, userInput.readNumber()); break;
           case "-" : answer = math.subtract(firstNum, userInput.readNumber()); break;
           case "*" : answer = math.multiply(firstNum, userInput.readNumber()); break;
           case "/" : answer = math.divide(firstNum, userInput.readNumber()); break;
           case "^2" : answer = math.square(firstNum); break;
           case "sqrt" : answer = math.squareroot(firstNum); break;
           case "exp" : answer = math.exponent(firstNum, userInput.readNumber()); break;

           case "switchUnitsMode" : answer = tMath.toggleRadsDeg(answer, radians); break;


           case "sin" : answer = tMath.sin(firstNum, radians); break; //convert
           case "cos" : answer = tMath.cos(firstNum, radians); break; //convert
           case "tan" : answer = tMath.tan(firstNum, radians); break; //convert

           case "insin" : answer = tMath.insin(firstNum); break;
           case "intan" : answer = tMath.intan(firstNum); break;
           case "incos" : answer = tMath.incos(firstNum); break;

           case "log" : answer = math.log(firstNum); break;
           case "10^" : answer = math.tenExp(firstNum); break;
           case "ln" : answer = math.ln(firstNum); break;
           case "ex" : answer = math.eToTheX(firstNum); break;
           case "factorial" : answer = math.factorial(firstNum); break;

           case "clear" : answer = 0.0 ; firstCycle = true; break;
           case "bin" : answer = math.bin(firstNum); break;

           case "^-1" : answer = math.inverse(firstNum); break;
           case "inv" : answer = math.invert(firstNum); break;

//           case "oct" : answer = math.oct(firstNum); break;
//           case "dec" : answer = math.dex(firstNum); break;
//           case "hex" : answer = math.hex(firstNum); break;

           case "M+" : memory = answer; break;
           case "MC" : memory = 0.0; break;
           case "MRC" : answer = memory; break;
           default: System.out.println("Invalid operator."); break;



       }
        System.out.println("State: " + answer);
    }


}

