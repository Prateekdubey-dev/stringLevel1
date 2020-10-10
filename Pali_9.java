
package String_Student;

import java.util.Scanner;

public class Pali_9
{
    public static void main(String[] args) {//PROGRAM-9
    Scanner sc = new Scanner(System.in);
    System.out.println("plz Enter any number");
    String name;
    int l;
    char ch;
    String str = "";
    name = sc.nextLine();
    l = name.length();
    for(int i=0;i<l;i++)
    {
       ch = name.charAt(i);
       str = ch + str;
    }
     if(name.equals(str))
     {
         System.out.println("palidrone");
     }
     else
     {
         System.out.println("Not an ");
     }
 }
}
