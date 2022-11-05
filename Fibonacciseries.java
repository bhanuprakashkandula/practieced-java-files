/*import java.util.Scanner;
class Fibonacciseries
{
public static void main(String args[])
{
Scanner k=new Scanner(System.in);
int first=0,sec=1,n,sum,i;
System.out.println("Enter a number :");
n=k.nextInt();
System.out.println("The fibonacci series upto given number are :");
for(i=0;i<=n;i++)
{
System.out.println(first);
sum=first+sec;
first=sec;
sec=sum;
}
}
}*/
  import java.util.Scanner;
class Fibonacciseries
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int F=0,S=1,i,n,sum;
      System.out.println("Enter the number");
      n=sc.nextInt();
      System.out.println("Limit up to the number");
      for(i=0;i<n;i++)
        {
          sum=F+S;
          F=S;
          S=sum;
          System.out.println(F);
        }
    }
  }