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
        System.out.println("9. matches to wins");
        System.out.println("10. wins to matches");

        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input
        
        if (selection==1)
        {
          
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
       if (selection == 2)
        {
        
            System.out.println("Enter Farenheit: ");
            double farnhitter = keyboard.nextDouble();
            keyboard.nextLine();
            double ciclic = farnhitter * (5.0 / 9.0) - 32;
            System.out.println(farnhitter + " degrees farenheit is " + ciclic + " degrees celcius");
        }
        if (selection == 3)
        {
          
            System.out.println("enter feet: ");
            double feet= keyboard.nextDouble();
            keyboard.nextLine();
            double metres = feet * (1/3);
            System.out.println(feet + " feet is " +metres + " metres");
        }
        if (selection== 4)
        { 
            System.out.println("enter metres: ");
        double meter= keyboard.nextDouble();
        keyboard.nextLine();
        double fet = meter * (3);
        System.out.println(meter + " metres is " +fet + " feet");
    }
    if (selection== 5)
    { 
        System.out.println("enter ounces: ");
    double ounces= keyboard.nextDouble();
    keyboard.nextLine();
    double milli = ounces * (29.5);
    System.out.println(ounces + " ounces is " +milli + " Milliliters");
}
if (selection== 6)
    { 
        System.out.println("enter milliliters: ");
    double mil= keyboard.nextDouble();
    keyboard.nextLine();
    double ounce= mil * (1.0/29.5);
    System.out.println(mil + " milliliters is " +ounce + " ounces");
}
        if (selection == 7)
        {
            System.out.println("Enter chances created");
            double chances= keyboard.nextDouble();
            keyboard.nextLine();
            double goals= chances/3.0 + 0;
            System.out.println( (int)chances + " chances created is " + (int)goals + " goals scored");
        }
        if (selection == 9)
        {
            System.out.println("Enter matches played");
            double matches= keyboard.nextDouble();
            keyboard.nextLine();
            double wins= matches/2.0;
            System.out.println( (int)matches + " matches played is " + (int)wins + " wins");
        }
        if (selection == 10)
        {
            System.out.println("Enter wins");
            double win= keyboard.nextDouble();
            keyboard.nextLine();
            double match= win*2.0;
            System.out.println( (int)win + " wins is " + (int)match + " matches played");
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