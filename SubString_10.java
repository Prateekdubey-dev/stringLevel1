
package String_Student;

import java.util.Scanner;

public class SubString_10 
{
    public static void main(String[] args)
    {   //PROGRAM-10
        Scanner sc = new Scanner(System.in);
        System.out.println("plz enter any String");
        String name,name1,name2;
        int l;
        name = sc.nextLine();
        name1 = name.substring(0, 3);// last_index -1
        name2 = name.substring(3);//
        System.out.println("The SubString " + name1);
        System.out.println("The SubString " + name2);
        
    }
 
}
