
package String_Student;

import java.util.Scanner;

public class Vowel_4 
{
    public static void main(String[] args)
    {           //PROGRAM-4
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz Enter String");
        String name;
        int l;
        char ch1,ch;int count =0;
        name = sc.nextLine();
        l = name.length();
        for(int i =0 ;i<l;i++)
        {
            ch1 = name.charAt(i);
            ch =  Character.toLowerCase(ch1);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
        }
        System.out.println("The Total no. Vowel " + count);
        
    }
}
