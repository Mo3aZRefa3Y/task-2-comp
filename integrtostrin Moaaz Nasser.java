import java.util.Scanner;
public class integrtostrin {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = input.nextInt();
		String x = integerToString(num);
		x = reverse(x);
		System.out.println(x);
	}
	
	public static String integerToString (int integer)
	{
		int intCopy = integer;
		String str = "";
		if(integer == 0)
		{
			str+='0';
			return str;
		}
		while(integer !=0)
		{
			str+=(char)((Math.abs(integer)%10)+48);
			integer /= 10;
		}
		if(intCopy<0)
		{
			str+='-';
		}
		return str;
	}
	public static String reverse (String input)
	{
		String reversed = "";
		for(int i = input.length()-1 ; i>=0 ; i--)
		{
			reversed += input.charAt(i);
		}
		return reversed;
	}
	}