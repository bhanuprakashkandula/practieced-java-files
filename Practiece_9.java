import java.util.Scanner;
class Practiece_9
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      String str;
      System.out.println("Enetr the String");
      str=sc.nextLine();
      StringBuffer Strbuff=new StringBuffer(str);
      System.out.println(""+Strbuff.reverse());
    }
  }