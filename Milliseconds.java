import java.util.Scanner;
public class Milliseconds
{
    public static void main (String [] args)
    {
        //
        final int MILISECONDS_IN_DAY = 86400000 ; 
        final int MILISECONDS_IN_HOUR = 3600000 ;
        final int MILISECONDS_IN_MINUTE = 60000 ;
        final int MILISECONDS_IN_SECOND = 1000 ;
        Scanner scan = new Scanner (System.in);
        System.out.println ("This program reads an integer which " +
            "represents Milliseconds and converts it to days, " +
            "hours, minutes and seconds. ");
        System.out.println ("Please enter the number of Milliseconds");
        long ms = scan.nextLong();
        long d = ms / MILISECONDS_IN_DAY;
        long h = ms / MILISECONDS_IN_HOUR % 24;
        long m = ms / MILISECONDS_IN_MINUTE % 60;
        long s = ms / MILISECONDS_IN_SECOND % 60;
        
        System.out.println(d + " days " + h + ":"+ m + ":" + s + " hours" );
    } // end of method main
} //end of class Milliseconds