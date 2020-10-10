
package String_Student;

import java.util.Scanner;

public class ZiZ_ZAz_8 
{
    public static void main(String[] args)
   {//PROGRAM-8
     Scanner sc = new Scanner(System.in);
     System.out.println("Plz enter any String");
     String name;
     int l;
     char ch,ch1;
     String  str = "";
     name = sc.nextLine();
     l = name.length();
     for(int i =0 ;i< l; i++)
     {
        ch = name.charAt(i);
        if(i%2==0)
        {
          ch1 =   Character.toLowerCase(ch);
        }
        else
        {
          ch1 = Character.toUpperCase(ch);
        }
         str = str  + ch1;
     }
       System.out.println("Resulting String is " + str);
     
   }
   
}
