/*import java.util.*;
class LinearSearch
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n,ser;
System.out.println("Enter Array Size:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter Elements to Array:"); 
  for(i=0;i<n;i++)
  {
    a[i]=sc.nextInt();
  }
System.out.println("The Elements in an Array is:"); 
for(i=0;i<n;i++)
  {
    System.out.println("\t"+a[i]);
  } 

System.out.println("Enter the value for Search:");
ser=sc.nextInt();

//Linear Search
for(i=0;i<n;i++)
{
if(ser==a[i])
{
System.out.println(ser +" is Found at Location"+(i+1));
break;
} 
}
if(i==n)
System.out.println(ser +" is Not Found");
}
}*/
import java.util.Scanner;
class LinearSearch
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(Sytsem.in);
      int n;
     System.out.println("Enter the array size");
      n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the Elements in an array");
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("The elements in the array is:");
      {
        for(int i=0;i<n;i++)
          {
            System.out.println(""+arr[i]);
          }
      System.out.println("Enter the search element");
      int ser=sc.nextInt();
      if(ser==arr[i])
      {
        System.out.println(ser+"Found at location"+(i+1));
        break;
      }
      if(i==n)
      {
       System.out.println(ser+"Is not Found"); 
      }
    }
  }
  }