//Write a JAVAprogram to check whether a number is divisible by 5 and 11 or not.
 import java.util.*;
class Division
{
   public static void main(String args[]) 
    {   
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
      System.out.println("first number:");
        int div=sc.nextInt();
      System.out.println("secound number");
        int divi =sc.nextInt();
        if((num%div==0)&&(num%divi==0))
        {
          System.out.println("Number " +num+ " is divisible by both numbers");
        }
        else 
        {
          System.out.println("Number " +num+ " is not divisible by both numbers");
        }
   }
}
