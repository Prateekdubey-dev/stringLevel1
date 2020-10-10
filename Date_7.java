
package String_Student;

import java.util.Scanner;

public class Date_7 
{
    public static void main(String[] args)
    {//PROGRAM-7
        Scanner sc = new Scanner(System.in);
        String date;
        System.out.println("Plz Enter any date");
        date = sc.nextLine();
        if(date.equalsIgnoreCase("Monday"))
            System.out.println("Day is  " + 1);
        else if(date.equalsIgnoreCase("Tuesday"))
            System.out.println("Day is  " + 2);
        else if(date.equalsIgnoreCase("Wednesday"))
            System.out.println("Day is  " + 3);
        else if(date.equalsIgnoreCase("Thursday"))
            System.out.println("Day is  " + 4);
        else if(date.equalsIgnoreCase("Friday"))
            System.out.println("Day is  " + 5);
        else if(date.equalsIgnoreCase("Saturday"))
            System.out.println("Day is  " + 6);
        else if(date.equalsIgnoreCase("Sunday"))
            System.out.println("Day is  " + 7);
        else
            System.out.println("Day is not Exist");
        
    }
}
