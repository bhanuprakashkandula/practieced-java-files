import java.util.Scanner;

class NoOfChars {
  public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      String str;
      int i=1;
      System.out.println("Enetr the string");
      str=sc.nextLine();
       while(i<=str.length())
        {
        System.out.print(i++);
        }
    }
}
