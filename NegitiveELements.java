import java.util.Scanner;

public class NegitiveELements
{
  public static void main(String[] args) 
  {
    // create Scanner class object to take input
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of the array: ");
    int n = sc.nextInt();
     int arr[] = new int[n];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < n; i++)
      {
      arr[i] = sc.nextInt();
    }
     System.out.println("Negative numbers = ");
    for (int i=0; i < arr.length;i++)
      {
      if(arr[i] < 0)
      {
        System.out.println( arr[i]+" ");
      }
    }
  }
}