package mccann.kurt.calculator;

/**
 * Created by kurtmccann on 9/11/16.
 */
public class Display
{
    double display;
    String errorMessage = "error";

    public double getDisplay()
    {
        return this.display;
    }

    public void setDisplay(double newDisplay)
    {
        this.display = newDisplay;
    }

    public void clearDisplay()
    {
        this.display = 0;
    }

    public void switchDisplay()
    {
        this.display = this.display * (-1);
    }


}
