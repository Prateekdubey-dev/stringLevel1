
package String_Student;

import java.util.Scanner;

public class Space_5 
{
    public static void main(String[] args) 
    {       //PROGRAM-5
        Scanner sc = new Scanner(System.in);
        System.out.println("plz enter any Words");
        String name;
        int l;
        char ch;
        int count = 1;
        name = sc.nextLine();
        l = name.length();
        for(int i =0 ; i<l; i++)
        {
           ch= name.charAt(i);
           if(ch == ' ')
           {
              count++; 
           }
        }
        System.out.println("The word in a Sentence is  " + count);
        
    }
 
}
