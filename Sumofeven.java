//Write a JAVAprogram to find sum of all even numbers between 1 to n.
import java.util.Scanner;
class Sumofeven
  {
  public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
     int i,n,sum=0;
      System.out.println("Enter the number");
      n=sc.nextInt();
      for(i=2;i<=n;i++)
        
        if(i%2==0)  
        
           sum=sum+i;
        
        System.out.println("sum of even numbers:  "+sum); 
      }
    }
  