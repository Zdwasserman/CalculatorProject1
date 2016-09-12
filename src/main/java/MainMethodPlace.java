/**
 * Created by kurtmccann on 9/12/16.
 */
public class MainMethodPlace
{
    public static void main(String[] args)
    {
        Calculator c;
        Calculator c1 = new Calculator();
        c1.setFirstNum(22);
        c1.setSecondNum(2);
        c1.setOperator("-");
        double answer = c1.executeOperation();
        System.out.println(answer);
    }
}
