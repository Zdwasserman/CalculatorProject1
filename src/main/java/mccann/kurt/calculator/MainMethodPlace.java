package mccann.kurt.calculator;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;
/**
 * Created by kurtmccann on 9/12/16.
 */
public class MainMethodPlace
{
    public static void main(String[] args)
    {
        Calculator c1 = new Calculator();
        boolean isOn = true;
        do{
            c1.executeCommand();

            Scanner input = new Scanner(System.in);
            System.out.println("Do you want to continue? y/n?");
            char keepGoing = input.next().charAt(0);
            if (keepGoing == 'n'){
                isOn = false;
            }
        }while(isOn == true);
        System.out.println("Sayonara!");

    }
}
