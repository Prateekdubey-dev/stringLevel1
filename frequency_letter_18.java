
package String_Student;

import java.util.Scanner;

public class frequency_letter_18
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("plz enter an string");
      String str;
      int l;
      str = sc.nextLine();
      str = str.toLowerCase();
      l = str.length();
      char ch;
      int cs;
      for(cs='a';cs<='z';cs++)
      {
          int count = 0;
         for(int i=0;i<l;i++)
         {
            ch = str.charAt(i);
            if(ch==cs)
            {
               count++; 
            }
         }
          
         if(count>0)
         {
             System.out.println("The Frequency of an no. is" + " " + cs + " " + count);
         }
      }
        
      
    }
    
}
