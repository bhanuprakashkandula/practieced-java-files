
/*public class SumOfArray {
  public static void main(String[] args) {

    // declare array and 
    // initialize it with values
    int array[] = {1, 2, 3, 4, 10,11};

    // initialize sum variable with 0
    int sum = 0;

    // add array elements
    for (int i=0; i<array.length; i++) {
      sum += array[i]; // sum = sum + array[i];
    }

    // display the result
    System.out.println("Sum of array elements= " + sum);

  }
}*/
 import java.util.Scanner;
class SumOfArray
  {
    public static void main(String[]args)
    {
      Scanner sc =new Scanner(System.in);
      int n,i,sum=0;
      System.out.println("Enter the size");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("ENter the elements");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      for(i=0;i<n;i++)
        {
          sum=sum+a[i];
        }
      System.out.print(""+sum);
    }
  }