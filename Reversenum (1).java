//Write a JAVAprogram to print all natural numbers in reverse (from n to 1). - using while loop
import java.util.Scanner;
class Reversenum
  {
    public static void main(String[]args)
    {
     int i = 10;
		System.out.println("The First 10 Natural Numbers in Reverse");
		while( i >= 1) 
		{
			System.out.println(i);
			i--;
		}
	}
}