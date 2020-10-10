
package String_Student;

import java.util.Scanner;

public class lexico_13
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("plz enter any string");
       int r;
       String name,name1;
       name = sc.nextLine();
       name1 = sc.nextLine();
       r = name.compareToIgnoreCase(name1);
       if(r == 0)
       {
           System.out.println("Same string");
       }
       else if(r>0)
       {
           System.out.println(name  + "Comes later");  
       }
       else
       {
           System.out.println(name1 + "comesssss");
       }
        
    }
}
