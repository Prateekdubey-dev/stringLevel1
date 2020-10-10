
package String_Student;

import java.util.Scanner;
//PROGRAM-2

public class SortName_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String name,name1,name2,shortname;
        System.out.println("PLz enter Ur First name  ");
        name = sc.next();//amar
        System.out.println("PLz enter Ur Second name  ");
        name1 = sc.next();
        
        System.out.println("PLz enter Ur Third name  ");
        name2 = sc.next();
        
        System.out.println("UR FULL name is " + name +" " + name1 + " " + name2 );
        
        shortname = name.charAt(0) + "." + name1.charAt(0) + "." + name2.charAt(0);
        
        System.out.println("UR Short name is  " + shortname);
    }
}
