package palindrome;

import java.util.Scanner;

public class palindromee{

    public static void main(String[] args)
    {
        System.out.println("Enter string to check:");
         
        Scanner read = new Scanner(System.in);
        String input = read.nextLine();
        String reversed = "";
        String str = "";
        
        for(int i1 = 0; i1 < input.length() ; i1++)
        {
        
        if ((input.charAt(i1)>64 && input.charAt(i1)<91)||(input.charAt(i1)>96 && input.charAt(i1)<123) )
            str += input.charAt(i1);
        }
        str = str.toLowerCase();
        
        
        for(int i2 = str.length() - 1; i2 >= 0; i2--)
        {
        
        reversed += str.charAt(i2);
          
        }
        
        System.out.println("str=  "+ str);
        System.out.println("reversed=  "+ reversed);

        
        if (reversed .equals (str) ) {
        System.out.println("True");}
        else { System.out.println("false");}

      
    }
}
