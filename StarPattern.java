import java.util.Scanner;
class StarPattern
{
  public static void main(String[]args)
  {
  Scanner sc=new Scanner(System.in);
    int n,i,j;
    System.out.println("Enter the number:");
    n=sc.nextInt();
    
    for(i=1;i<=n;i++)
      {
        for(j=i;j<=n;j++)
      {
        System.out.print("*");
      }
       // for(j=1;j<=1;j++)
         //{
              //  System.out.print("*");
         // }
        {
          System.out.println();
        }
  }
}
}