import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double inch = 0;
        double ft = 0;
        double miles = 0;
        double mt = 0;

        System.out.println("Enter the distance in meters");
        if (in.hasNextDouble())
        {
            mt = in.nextDouble();
            inch = mt * 39.3701;
            ft = mt * 3.280841666667;
            miles = mt * 0.000621371;
            System.out.println("The distance in inches is " + inch + " The distance in feet is " + ft + " The distance in miles " + miles);
        }
        else
        {
            System.out.println("You have entered an invalid distance");
        }


    }
}