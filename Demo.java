import java.util.Scanner;
class Demo
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      System.out.println("Enter the String name");
      str=sc.nextLine();
      for(int i=0;i<=str.length();i++)
        {
          System.out.println(i);
        }
    }
  }