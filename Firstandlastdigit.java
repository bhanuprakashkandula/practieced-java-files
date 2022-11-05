//First and last digit of a number
import java.util.Scanner;

public class Firstandlastdigit 
{
	public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
	{
		int number, first_digit, last_digit;
		System.out.print(" Please Enter any Number that you wish : ");
		number = sc.nextInt();	
		
		first_digit = number;
		while(first_digit >= 10)
		{
			first_digit = first_digit / 10;
		}	
		
		last_digit = number % 10;
		
		System.out.println("\n The First Digit of a Given Number " + number + "  =  " + first_digit);
		System.out.println("\n The Last Digit of a Given Number " + number + "  =  " + last_digit);
	}
}
}