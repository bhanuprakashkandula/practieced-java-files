//Write a JAVAprogram to check whether a character is uppercase or lowercase     alphabet.
import java.util.Scanner;
class Upperorlower
  {
     public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      char ch;
    System.out.println("enter the element:");
      ch=sc.next().charAt(0);
      if(ch>='a' && ch<='z')
      {
        System.out.println("it is lower case");
      }
      else
      {
      System.out.println("it is not lower case");  
      }
    }
  }