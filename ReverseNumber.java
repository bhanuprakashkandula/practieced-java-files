import java.util.Scanner;
class ReverseNumber
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int n,t,sum=0;
    System.out.println("Enter the number");
    n=sc.nextInt();
    t=n;
    while(n!=0)
      {
    int rem;
    rem=n%10;
    sum=(sum*10)+rem;
    n=n/10;
      }
     {
       System.out.print("it is polyndrom"+sum);
     }
  }
}