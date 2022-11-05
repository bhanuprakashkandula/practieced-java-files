//Count of even numbers
/*import java.util.Scanner;
class Practiece_12
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int n,i;
      n=sc.nextInt();
      i=2;
      while(i<=n)
        {
          System.out.println(i+"");
          i=i+2;
           
        }
    }
  }*/
import java.util.Scanner;
class Practiece_12
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int n,i;
      n=sc.nextInt();
      for(i=2;i<=n;i=i+2)
        {
          System.out.println(i+"");
         
        }
    }
  }