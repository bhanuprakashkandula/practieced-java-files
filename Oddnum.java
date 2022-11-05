//Write a JAVAprogram to print all odd number between 1 to 100.
import java.util.Scanner;
class Oddnum
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
    int i=1,n;
      System.out.println("Enter the number");
      n=sc.nextInt();
  for(i=1;i<n;i++)
{
  if(i%2!=0)
  System.out.println(i);
  i++;
}
  }
  }