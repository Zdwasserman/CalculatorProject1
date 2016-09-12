/**
 * Created by kurtmccann on 9/11/16.
 */
public class Memory
{
    double m = 0;

    public void mPlus(double fromDisplay)
    {
        this.m = fromDisplay;
    }

    public void mC()
    {
        this.m = 0;
    }

    public double mRC()
    {
        return this.m;
    }


}
