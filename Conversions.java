import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. chances created to goals");
        System.out.println("8. goals to chances created");
        System.out.println("9. possesion to wins");
        System.out.println("10. wins to possesion");

        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 7)
        {
            System.out.println("Enter chances created");
            double chances= keyboard.nextDouble();
            keyboard.nextLine();
            double goals= chances/3.0 + 0;
            System.out.println( (int)chances + " chances created is " + (int)goals + " goals scored");
        }
        
if (selection==8)
{
            System.out.println("Enter goals scored");
            double goals= keyboard.nextDouble();
            keyboard.nextLine();
            double chances= goals*3;
            System.out.println( (int)goals + " goals scored is about " + (int)chances + " chances created");
            
            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
        }
        //add more if statements here.
    }
}