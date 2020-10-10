
package String_Student;

import java.util.Scanner;

public class World_wonder_24 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       String country[] ={"india","France","usa","brazil","china"};
       String wonder[] = {"tajmahal","afieltower","liberty","football","the great wall of china"};
       String cn;
       int i;
        System.out.println("..........Enter any country name is to be serach........");
        cn = sc.nextLine();
       for( i =0 ;i<7 ;i++)   
       {
        if(country[i].equalsIgnoreCase(cn))
        {
            System.out.println(wonder[i]);
        }
       }
    } 
}
