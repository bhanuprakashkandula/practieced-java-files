//Write a JAVAprogram to input any alphabet and check whether it is vowel or    consonant.
import java.util.Scanner;
class Vovelorconsonent
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      char ch;
      System.out.println("enter the charecter:");
      ch=sc.next().charAt(0);
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
      {
        System.out.println("It is vowel");
      }
      else 
      {
     System.out.println("It is cosonat");   
      }
    }
  }