public class Practiece_11
  {
    public static void main(String[] args)
    {
        String blogName = "java2blog";
        String reverse = "";
        for (int i = blogName.length() - 1; i >= 0; i--)
          {
            reverse = reverse + blogName.charAt(i);
          }
        System.out.println("Reverse of java2blog is: " + reverse);
    }
}
/*
 * import java.util.Scanner; class ReverseString { public static void
 * main(String[]args) 
{ 
Scanner sc=new Scanner(System.in);
String str; 
//char
System.out.println("enter the string");
str=sc.nextLine();
 char ch[]=str.toCharArray(); 
String rev=""; 
for(int i=str.length()-1;i>=0;i--) 
{
 rev=rev+str.charAt(i);
}
System.out.println(rev); 
}
}
 */
/*import java.util.Scanner;
class ReverseString
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      String str;
        System.out.println("enter the string");
      str=sc.nextLine();
      char[]ch=str.toCharArray();
      String rev=" ";
      for(int i=str.length()-1;i>=0;i--)
        {
          rev=rev+str.charAt(i);
        }
      System.out.println(rev);
    }
  }*/
/*import java.util.Scanner;

public class Example {	
	
	private static Scanner sc;	
	
	public static void main(String[] args) 
	{
		String revStr;

		sc= new Scanner(System.in);

		System.out.print("\nPlease Enter Text =  ");
		revStr = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(revStr);
		
		System.out.println("The result =  " + sb.reverse());
	}
}*/
/*import java.util.Scanner;
public class Example2 {
	private static Scanner sc;
	public static void main(String[] args) {
		String revStr;
		int i;

		sc= new Scanner(System.in);

		System.out.print("\nPlease Enter =  ");
		revStr = sc.nextLine();
		
		String newStr = "";
		
		for(i = revStr.length() - 1; i >= 0; i--) {
			newStr += revStr.charAt(i);
		}		
		System.out.println("The result =  " + newStr);
	}
}*/
/*import java.util.Scanner;

public class Example3 {
	private static Scanner sc;
	public static void main(String[] args) {
		String revStr;
		int i, j = 0;

		sc= new Scanner(System.in);

		System.out.print("\nPlease Enter Text =  ");
		revStr = sc.nextLine();
		
		char[] revCharArr = revStr.toCharArray();
		
		System.out.print("\nThe result =  " );
		for(i = revCharArr.length - 1; i >= 0; i--) {
			revCharArr[j++] = revStr.charAt(i);
		}		
		System.out.print(revCharArr);
	}
}*/
/*import java.util.Scanner;

public class Example4 {
	private static Scanner sc;
	public static void main(String[] args) {
		String revStr;

		sc= new Scanner(System.in);

		System.out.print("\nPlease Enter =  ");
		revStr = sc.nextLine();
		
		char[] revCharArr = revStr.toCharArray();
		String newSt = "";
		int i = revCharArr.length - 1; 
		
		System.out.print("\nThe first result  =  " );
		while(i >= 0) {
			
			System.out.print(revCharArr[i]);
			newSt += revCharArr[i];
			i--;
		}		
		System.out.println("\nThe Second result =  " + newSt);
	}
}*/
/*import java.util.Scanner;

public class Example5 {
	private static Scanner sc;
	public static void main(String[] args) {
		String revStr;
		char temp;

		sc= new Scanner(System.in);

		System.out.print("\nPlease Enter Text =  ");
		revStr = sc.nextLine();
		
		char[] revCharArr = revStr.toCharArray();
		int len = revStr.length() - 1;
		
		System.out.print("\nThe result =  " );
		for(int i = 0; i < revCharArr.length / 2; i++) {
			temp = revCharArr[i];
			revCharArr[i] = revCharArr[len];
			revCharArr[len--] = temp;
		}		
		System.out.print(revCharArr);
	}
}
*/
/*import java.util.Scanner;

public class Example6 {
	private static Scanner sc;
	public static void main(String[] args) {
		String revStr;

		sc= new Scanner(System.in);

		System.out.print("\nPlease Enter Text =  ");
		revStr = sc.nextLine();
		
		StringBuffer sbuff = new StringBuffer(revStr);
		
		System.out.println("The result =  " + sbuff.reverse());
	}
}*/