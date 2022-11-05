import java.util.Scanner;
class SumOfDigits
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int temp,sum=0,n,r;
      System.out.println("Enter the number:");
      n=sc.nextInt();
      temp=n;
      while(n!=0)
        {
          r=n%10;
          sum=(sum)+r;
          n=n/10;
        }
      System.out.println(sum);
    }
  }