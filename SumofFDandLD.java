// Write a JAVAprogram to find sum of first and last digit of a number.
/*import java.util.Scanner;

public class SumofFDandLD
  {
	public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
	{
		int number, first_digit, last_digit,sum;
		System.out.print(" Please Enter any Number that you wish : ");
		number = sc.nextInt();	
		first_digit = number;
		while(first_digit >= 10)
		{
			first_digit = first_digit / 10;
		}	
		last_digit = number % 10;
		sum=first_digit+last_digit;
		System.out.println("\n The First Digit of a Given Number " + number + "  =  " + first_digit);
		System.out.println("\n The Last Digit of a Given Number " + number + "  =  " + last_digit);
    System.out.println("sum of first and last digits:"+sum);
	}
}
  }*/
import java.util.Scanner;
class SumofFDandLD
  {
  public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int FD,LD,sum,num;
      System.out.println("ENter the numbers you want to wish");
      num=sc.nextInt();
      FD=num;
      while(FD>=10)
        {
      FD=FD/10;
        }
      LD=num%10;
      sum=LD+FD;
          {
             System.out.println("The sum of last and first digits"+" "+sum);
          }
        }
    }
  
  